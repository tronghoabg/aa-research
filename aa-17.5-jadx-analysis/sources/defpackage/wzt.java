package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.feedback.FeedbackListActivity;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class wzt extends BaseAdapter {
    public static final /* synthetic */ int d = 0;
    private static final yph e = yph.c("GH.FeedbackAdapter");
    private static final FilenameFilter f = new tnc(2);
    public final wzs a;
    public ArrayList b = new ArrayList();
    public final FeedbackListActivity c;
    private final File g;

    public wzt(String str, FeedbackListActivity feedbackListActivity) {
        this.g = new File(str);
        this.c = feedbackListActivity;
        this.a = new wzs(this, str);
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.g.listFiles(f);
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                try {
                    arrayList.add(lbk.b(file));
                } catch (IOException e2) {
                    ((ype) ((ype) ((ype) e.h()).p(e2)).ai((char) 9984)).y("Couldn't load bundle %s", file);
                }
            }
        }
        Collections.sort(arrayList, new civ(18));
        new Handler(Looper.getMainLooper()).post(new xab(this, arrayList, 1));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) throws Throwable {
        Bitmap bitmapA;
        lbk lbkVar = (lbk) this.b.get(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feedback_list_item, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        TextView textView = (TextView) viewGroup2.findViewById(R.id.feedback_text);
        String str = lbkVar.f;
        if (str != null) {
            textView.setText(str);
        } else {
            textView.setText(viewGroup.getResources().getString(R.string.feedback_no_description_label, lbkVar.d));
        }
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.screenshot);
        Context context = viewGroup.getContext();
        Uri uri = lbkVar.h;
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.feedback_thumbnail_width);
        int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(R.dimen.feedback_thumbnail_height);
        if (uri != null) {
            kfu kfuVar = new kfu();
            kfv kfvVar = new kfv(context);
            kfvVar.a = uri;
            kfvVar.c(dimensionPixelSize);
            kfvVar.b(dimensionPixelSize2);
            bitmapA = kfuVar.a(kfvVar.a());
        } else {
            bitmapA = null;
        }
        if (bitmapA != null) {
            Uri uri2 = lbkVar.h;
            bitmapA.getAllocationByteCount();
            imageView.setImageBitmap(bitmapA);
        } else {
            imageView.setImageDrawable(null);
        }
        viewGroup2.setOnClickListener(new xae(this, lbkVar, 1, null));
        return viewGroup2;
    }
}
