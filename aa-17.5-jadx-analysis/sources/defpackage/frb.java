package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class frb implements fqp {
    public final fqv a;
    public final ftc b;

    public frb(fqv fqvVar, ftc ftcVar) {
        this.a = fqvVar;
        this.b = ftcVar;
    }

    @Override // defpackage.fqp
    public final Object a(afck afckVar) {
        return ahnc.a(afcp.a, new fan(new afdr() { // from class: fqz
            @Override // defpackage.afdr
            public final Object invoke() throws ijb, IOException {
                float fB;
                float fA;
                aezu aezuVar;
                int iK;
                int iK2;
                Picture pictureF;
                float fG;
                frb frbVar = this.a;
                ajna ajnaVarA = frbVar.a.a();
                try {
                    InputStream inputStreamL = ajnaVarA.l();
                    int i = iip.f;
                    iip iipVarB = new iji().b(inputStreamL);
                    affa.n(ajnaVarA, null);
                    ihq ihqVar = iipVarB.a;
                    if (ihqVar == null) {
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    igo igoVar = ihqVar.w;
                    RectF rectF = igoVar != null ? new RectF(igoVar.a, igoVar.b, igoVar.a(), igoVar.b()) : null;
                    if (rectF != null) {
                        fB = rectF.width();
                        fA = rectF.height();
                    } else {
                        fB = iipVarB.b();
                        fA = iipVarB.a();
                    }
                    ftc ftcVar = frbVar.b;
                    int i2 = ftcVar.o;
                    ftn ftnVar = ftcVar.d;
                    if (a.bc(ftnVar)) {
                        aezuVar = new aezu(Float.valueOf(fB > BitmapDescriptorFactory.HUE_RED ? fB : 512.0f), Float.valueOf(fA > BitmapDescriptorFactory.HUE_RED ? fA : 512.0f));
                    } else {
                        aezuVar = new aezu(Float.valueOf(fvl.g(ftnVar.b, i2)), Float.valueOf(fvl.g(ftnVar.c, i2)));
                    }
                    float fFloatValue = ((Number) aezuVar.a).floatValue();
                    float fFloatValue2 = ((Number) aezuVar.b).floatValue();
                    if (fB <= BitmapDescriptorFactory.HUE_RED || fA <= BitmapDescriptorFactory.HUE_RED) {
                        iK = afgi.k(fFloatValue);
                        iK2 = afgi.k(fFloatValue2);
                        iipVarB.e("100%");
                        iipVarB.d("100%");
                    } else {
                        float f = fFloatValue / fB;
                        float f2 = fFloatValue2 / fA;
                        float fMin = i2 + (-1) != 0 ? Math.min(f, f2) : Math.max(f, f2);
                        iipVarB.e(fB + "px");
                        iipVarB.d(fA + "px");
                        float fA2 = iipVarB.a();
                        float fB2 = iipVarB.b();
                        iK2 = (int) (fMin * fA);
                        iK = (int) (fMin * fB);
                        if (fA2 > BitmapDescriptorFactory.HUE_RED && fB2 > BitmapDescriptorFactory.HUE_RED) {
                            float f3 = fA2 * fMin;
                            ihq ihqVar2 = iipVarB.a;
                            if (ihqVar2 == null) {
                                throw new IllegalArgumentException("SVG document is empty");
                            }
                            ihqVar2.d = new iha(f3);
                            ihqVar2.c = new iha(fB2 * fMin);
                            iipVarB.e *= fMin;
                        }
                    }
                    if (rectF == null && fB > BitmapDescriptorFactory.HUE_RED && fA > BitmapDescriptorFactory.HUE_RED) {
                        ihq ihqVar3 = iipVarB.a;
                        if (ihqVar3 == null) {
                            throw new IllegalArgumentException("SVG document is empty");
                        }
                        ihqVar3.w = new igo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fB, fA);
                    }
                    Bitmap.Config config = ftcVar.b;
                    if (config == Bitmap.Config.HARDWARE) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iK, iK2, config);
                    bitmapCreateBitmap.getClass();
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    ihq ihqVar4 = iipVarB.a;
                    iha ihaVar = ihqVar4.c;
                    if (ihaVar != null) {
                        float f4 = iipVarB.b;
                        float fG2 = ihaVar.g();
                        igo igoVar2 = ihqVar4.w;
                        if (igoVar2 != null) {
                            fG = (igoVar2.d * fG2) / igoVar2.c;
                        } else {
                            iha ihaVar2 = ihqVar4.d;
                            fG = ihaVar2 != null ? ihaVar2.g() : fG2;
                        }
                        pictureF = iipVarB.f((int) Math.ceil(fG2), (int) Math.ceil(fG));
                    } else {
                        pictureF = iipVarB.f(sk.AUDIO_CONTENT_BUFFER_SIZE, sk.AUDIO_CONTENT_BUFFER_SIZE);
                    }
                    pictureF.draw(canvas);
                    Resources resources = ftcVar.a.getResources();
                    resources.getClass();
                    return new fqn(new BitmapDrawable(resources, bitmapCreateBitmap), true);
                } finally {
                }
            }
        }, (afck) null, 3), afckVar);
    }
}
