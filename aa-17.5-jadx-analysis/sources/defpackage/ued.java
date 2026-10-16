package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Picture;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class ued implements upw {
    public final AtomicBoolean a = new AtomicBoolean(false);
    final /* synthetic */ ueg b;
    private final abiq c;

    public ued(ueg uegVar, abiq abiqVar) {
        this.b = uegVar;
        this.c = abiqVar;
    }

    public static final abis b(abiq abiqVar, upy upyVar, Resources resources) {
        int iA = upyVar.a();
        if (iA == 3) {
            Bitmap bitmapC = upyVar.c();
            return bitmapC == null ? ueg.a(abiqVar) : ueg.b(abiqVar, bitmapC, resources);
        }
        if (iA != 6) {
            return ueg.a(abiqVar);
        }
        Picture pictureD = upyVar.d();
        pictureD.getClass();
        float width = (abiqVar.b & 8) != 0 ? abiqVar.f : pictureD.getWidth();
        float height = (abiqVar.b & 16) != 0 ? abiqVar.g : pictureD.getHeight();
        float f = (abiqVar.b & 4) != 0 ? abiqVar.e : 1.0f;
        abnp abnpVarN = abis.a.n();
        long j = abiqVar.c;
        abnpVarN.t();
        abis abisVar = (abis) abnpVarN.b;
        abisVar.b |= 1;
        abisVar.c = j;
        abnp abnpVarN2 = abka.a.n();
        abnpVarN2.t();
        abka abkaVar = (abka) abnpVarN2.b;
        abkaVar.b |= 1;
        abkaVar.c = width / f;
        abnpVarN2.t();
        abka abkaVar2 = (abka) abnpVarN2.b;
        abkaVar2.b |= 2;
        abkaVar2.d = height / f;
        abnpVarN.t();
        abis abisVar2 = (abis) abnpVarN.b;
        abka abkaVar3 = (abka) abnpVarN2.q();
        abkaVar3.getClass();
        abisVar2.d = abkaVar3;
        abisVar2.b |= 2;
        return (abis) abnpVarN.q();
    }

    @Override // defpackage.upw
    public final void a(upy upyVar) {
        AtomicBoolean atomicBoolean = this.a;
        abiq abiqVar = this.c;
        ueg uegVar = this.b;
        abis abisVarB = b(abiqVar, upyVar, uegVar.i);
        if (atomicBoolean.compareAndSet(false, true)) {
            uel uelVar = uegVar.d;
            ((ynz) ((ynz) uel.a.e()).ai(9289)).x("[App thread] schedule MeasureIconLayerResponse: id %s", abisVarB.c);
            uelVar.i(new txo(uelVar, abisVarB, 9, null));
        }
    }
}
