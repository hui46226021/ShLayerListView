package com.sh.zsh.code;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.sh.zsh.code.layerListView.model.Node;
import com.sh.zsh.code.layerListView.TreeListViewAdapter.OnTreeNodeClickListener;
import com.sh.zsh.code.layerListView.LayerListView;

public class MainActivity extends Activity
{

	private List<FileBean> mDatas = new ArrayList<FileBean>();
	private LayerListView layerListView;


	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initDatas();
		layerListView = (LayerListView) findViewById(R.id.layerListView);
		layerListView.setmDatas(mDatas);

		layerListView.setOnTreeNodeClickListener(new OnTreeNodeClickListener()
		{
			@Override
			public void onClick(Node node, int position)
			{
				if (node.isLeaf())
				{
					Toast.makeText(getApplicationContext(), node.getName(),
							Toast.LENGTH_SHORT).show();
				}
			}

		});
	}

	private void initDatas()
	{
//		mDatas.add(new Bean(1, 0, "根目录1"));
//		mDatas.add(new Bean(2, 0, "根目录2"));
//		mDatas.add(new Bean(3, 0, "根目录3"));
//		mDatas.add(new Bean(4, 0, "根目录4"));
//		mDatas.add(new Bean(5, 1, "子目录1-1"));
//		mDatas.add(new Bean(6, 1, "子目录1-2"));
//
//		mDatas.add(new Bean(7, 5, "子目录1-1-1"));
//		mDatas.add(new Bean(8, 2, "子目录2-1"));
//
//		mDatas.add(new Bean(9, 4, "子目录4-1"));
//		mDatas.add(new Bean(10, 4, "子目录4-2"));
//
//		mDatas.add(new Bean(11, 10, "子目录4-2-1"));
//		mDatas.add(new Bean(12, 10, "子目录4-2-3"));
//		mDatas.add(new Bean(13, 10, "子目录4-2-2"));
//		mDatas.add(new Bean(14, 9, "子目录4-1-1"));
//		mDatas.add(new Bean(15, 9, "子目录4-1-2"));
//		mDatas.add(new Bean(16, 9, "子目录4-1-3"));

//		mDatas.add(new FileBean(1, 0, "文件管理系统"));
		mDatas.add(new FileBean(2, 1, "游戏"));
		mDatas.add(new FileBean(3, 1, "文档"));
		mDatas.add(new FileBean(4, 1, "程序"));
		mDatas.add(new FileBean(5, 2, "war3"));
		mDatas.add(new FileBean(6, 2, "刀塔传奇"));

		mDatas.add(new FileBean(7, 4, "面向对象"));
		mDatas.add(new FileBean(8, 4, "非面向对象"));

		mDatas.add(new FileBean(9, 7, "C++"));
		mDatas.add(new FileBean(10, 7, "JAVA"));
		mDatas.add(new FileBean(11, 7, "Javascript"));
		mDatas.add(new FileBean(12, 8, "C"));
		mDatas.add(new FileBean(15, 5, "war31"));
		mDatas.add(new FileBean(16, 5, "war32"));
		mDatas.add(new FileBean(17, 15, "war33"));
		mDatas.add(new FileBean(18, 15, "war35"));
		mDatas.add(new FileBean(19, 17, "war37"));
		mDatas.add(new FileBean(20, 17, "war38"));

	}

}
