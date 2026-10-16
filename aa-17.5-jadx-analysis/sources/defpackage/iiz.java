package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class iiz extends iiy {
    public float a = BitmapDescriptorFactory.HUE_RED;
    final /* synthetic */ ija b;

    public iiz(ija ijaVar) {
        this.b = ijaVar;
    }

    @Override // defpackage.iiy
    public final void a(String str) {
        this.a += this.b.d.d.measureText(str);
    }
}
