package defpackage;

import android.graphics.Path;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class iit extends iiu {
    final /* synthetic */ ija a;
    private final Path e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iit(ija ijaVar, Path path, float f) {
        super(ijaVar, f, BitmapDescriptorFactory.HUE_RED);
        this.a = ijaVar;
        this.e = path;
    }

    @Override // defpackage.iiu, defpackage.iiy
    public final void a(String str) {
        ija ijaVar = this.a;
        if (ijaVar.i()) {
            iiw iiwVar = ijaVar.d;
            if (iiwVar.b) {
                ijaVar.a.drawTextOnPath(str, this.e, this.b, this.c, iiwVar.d);
            }
            iiw iiwVar2 = ijaVar.d;
            if (iiwVar2.c) {
                ijaVar.a.drawTextOnPath(str, this.e, this.b, this.c, iiwVar2.e);
            }
        }
        this.b += ijaVar.d.d.measureText(str);
    }
}
