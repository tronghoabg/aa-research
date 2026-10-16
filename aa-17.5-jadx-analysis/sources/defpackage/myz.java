package defpackage;

import android.content.res.ColorStateList;
import android.util.IntProperty;
import android.widget.ImageView;

/* loaded from: classes2.dex */
final class myz extends IntProperty {
    public static final myz a = new myz();

    private myz() {
        super("imageTintList");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ImageView imageView = (ImageView) obj;
        imageView.getClass();
        ColorStateList imageTintList = imageView.getImageTintList();
        return Integer.valueOf(imageTintList != null ? imageTintList.getDefaultColor() : 0);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, int i) {
        ImageView imageView = (ImageView) obj;
        imageView.getClass();
        imageView.setImageTintList(thg.h(i));
    }
}
