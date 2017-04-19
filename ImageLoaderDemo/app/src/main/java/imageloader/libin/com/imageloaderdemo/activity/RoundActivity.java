package imageloader.libin.com.imageloaderdemo.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;

import imageloader.libin.com.imageloader.ImageLoader;
import imageloader.libin.com.imageloaderdemo.R;

public class RoundActivity extends AppCompatActivity {
    SimpleDraweeView iv_round;
    ImageView iv_circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round);

        iv_round = (SimpleDraweeView) findViewById(R.id.iv_round);
        iv_circle = (ImageView) findViewById(R.id.iv_circle);

        show();
    }

    private void show() {


        ImageLoader.with(this)
                .thumbnail("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490944508&di=671845045c66356487c1a539c4ed0717&imgtype=jpg&er=1&src=http%3A%2F%2Fattach.bbs.letv.com%2Fforum%2F201606%2F27%2F185306g84m4gsxztvzxjt5.jpg")

                .url("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490944508&di=671845045c66356487c1a539c4ed0717&imgtype=jpg&er=1&src=http%3A%2F%2Fattach.bbs.letv.com%2Fforum%2F201606%2F27%2F185306g84m4gsxztvzxjt5.jpg")
                 //.thumbnail("http://img.yxbao.com/news/image/201703/13/7bda462477.gif")
                // .res(R.drawable.thegif)
//                .placeHolder(R.mipmap.ic_launcher,false)
                .rectRoundCorner(30, R.color.default_stroke_color)
//                .blur(40)
                .into(iv_round);


//        ImageLoader.with(this)
//                .placeHolder(R.mipmap.ic_launcher,false)
//                //.res(R.drawable.thegif)
//                .url("https://pic1.zhimg.com/v2-7868c606d6ddddbdd56f0872e514925c_b.jpg")
//                .widthHeight(250, 150)
//                .rectRoundCorner(15, R.color.colorPrimary)
//                .blur(20)
//                .asBitmap(new SingleConfig.BitmapListener() {
//                    @Override
//                    public void onSuccess(Bitmap bitmap) {
//                        Log.e("bitmap", bitmap.getWidth() + "---height:" + bitmap.getHeight() + "--" + bitmap.toString());
//                        iv_round.setImageBitmap(bitmap);
//                    }
//
//                    @Override
//                    public void onFail() {
//                        Log.e("bitmap", "fail");
//
//                    }
//                });
////        .into(ivRes);


    }
}