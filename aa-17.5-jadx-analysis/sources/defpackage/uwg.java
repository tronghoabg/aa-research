package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class uwg {
    private static final yob e = yob.c("com/google/android/libraries/geo/mapcore/renderer/TextureAtlas2");
    public final Object a;
    public final uwh b;
    public final aeie c;
    public final uwe d;
    private final uwj f;

    public uwg(String str, int i, int i2, int i3, int i4) {
        uwh uwhVar = new uwh(i, i2, i3, i4);
        uwj uwjVar = new uwj(str, i);
        this.a = new Object();
        this.c = new aeit(null);
        this.b = uwhVar;
        this.f = uwjVar;
        this.d = new uwe();
    }

    public final int a() {
        int iC;
        synchronized (this.a) {
            iC = this.b.c();
        }
        return iC;
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            uwh uwhVar = this.b;
            i = uwhVar.b.a * uwhVar.c;
        }
        return i;
    }

    public final int c() {
        int i;
        uwj uwjVar = this.f;
        synchronized (uwjVar) {
            i = uwjVar.g;
        }
        return i;
    }

    public final int d() {
        int i;
        uwj uwjVar = this.f;
        synchronized (uwjVar) {
            i = uwjVar.f;
        }
        return i;
    }

    public final uue e() {
        uue uueVarA;
        uwj uwjVar = this.f;
        synchronized (uwjVar) {
            uueVarA = uwjVar.a();
        }
        return uueVarA;
    }

    @ResultIgnorabilityUnspecified
    public final uwi f(Bitmap bitmap, int i, int i2, int i3, int i4, float f) {
        Object obj;
        synchronized (this.a) {
            aeie aeieVar = this.c;
            ajlp ajlpVar = (ajlp) aeieVar.h(i);
            if (ajlpVar != null) {
                Object obj2 = ajlpVar.b;
                woy.Z(((uwi) obj2).l != -1);
                woy.Z(ajlpVar.a > 0);
                ajlpVar.a++;
                return (uwi) obj2;
            }
            int iA = i2 < 0 ? this.b.a(bitmap.getWidth() + i3, bitmap.getHeight() + i3) : i2;
            if (iA == -1) {
                return null;
            }
            uwh uwhVar = this.b;
            int iD = uwhVar.d(iA);
            int iE = uwhVar.e(iA);
            int i5 = i4 + i4;
            int width = bitmap.getWidth() - i5;
            int height = bitmap.getHeight() - i5;
            boolean z = iA >= 0;
            woy.Z(z);
            usp uspVar = uwhVar.b;
            int iD2 = uspVar.d(iA) * uwhVar.c;
            woy.Z(z);
            ajlp ajlpVar2 = new ajlp(new uwi(this, i, iA, iD2, uspVar.b(iA) * uwhVar.d, iD, iE, width, height, i3, i4, f));
            ajlpVar2.a++;
            aeieVar.a(i, ajlpVar2);
            uwe uweVar = this.d;
            synchronized (uweVar) {
                obj = ajlpVar2.b;
                boolean z2 = uwhVar.b() == 0;
                int iF = uwhVar.f();
                uweVar.b = z2;
                uweVar.c = iF;
                int i6 = 0;
                while (true) {
                    ArrayList arrayList = uweVar.a;
                    if (i6 < arrayList.size()) {
                        ((aewk) arrayList.get(i6)).put(obj, bitmap);
                        i6++;
                    }
                }
            }
            return (uwi) obj;
        }
    }

    @ResultIgnorabilityUnspecified
    public final uwi g(int i) {
        synchronized (this.a) {
            ajlp ajlpVar = (ajlp) this.c.h(i);
            if (ajlpVar == null) {
                return null;
            }
            Object obj = ajlpVar.b;
            woy.Z(((uwi) obj).l != -1);
            woy.Z(ajlpVar.a > 0);
            ajlpVar.a++;
            return (uwi) obj;
        }
    }

    public final void h(uud uudVar) {
        int i;
        uwj uwjVar = this.f;
        synchronized (uwjVar) {
            uwjVar.c = null;
            char c = 0;
            while (true) {
                uue[] uueVarArr = uwjVar.e;
                if (c > 0) {
                    break;
                }
                uueVarArr[0] = uue.a;
                uwjVar.h[0] = 0;
                c = 1;
            }
            uwjVar.c = uudVar;
            i = uuc.a().b;
        }
        synchronized (this.a) {
            uwh uwhVar = this.b;
            if (uwhVar.b() != 0) {
                ((ynz) ((ynz) uwh.a.h()).ai((char) 9700)).u("onContextLost - The atlas still contained allocations, could be a bug.");
            }
            uwhVar.e = i;
        }
    }

    public final void i() {
        uwd uwdVar;
        char c;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        vaq.d();
        uvr uvrVar = uvr.a;
        uwe uweVar = this.d;
        synchronized (uweVar) {
            boolean z = uweVar.b;
            int i7 = uweVar.c;
            ArrayList arrayList = uweVar.a;
            uwdVar = new uwd(z, i7, (aewk) arrayList.set(uweVar.d, new aewk(16)));
            uweVar.d = (uweVar.d + 1) % arrayList.size();
        }
        uwj uwjVar = this.f;
        synchronized (uwjVar) {
            if (uwdVar.a) {
                uud uudVar = uwjVar.c;
                if (uudVar != null) {
                    char c2 = 0;
                    while (true) {
                        uue[] uueVarArr = uwjVar.e;
                        if (c2 > 0) {
                            break;
                        }
                        if (uueVarArr[0].b()) {
                            uudVar.i(uueVarArr[0]);
                            uueVarArr[0] = uue.a;
                            uwjVar.h[0] = 0;
                        }
                        c2 = 1;
                    }
                }
                return;
            }
            int i8 = uwdVar.b;
            uue[] uueVarArr2 = uwjVar.e;
            uwjVar.d = 0;
            vaq.d();
            uud uudVar2 = uwjVar.c;
            char c3 = 65535;
            if (uudVar2 != null) {
                int i9 = uwjVar.i;
                if (i9 != 0) {
                    uwjVar.i = i9 + 1;
                } else {
                    uwjVar.i = 1;
                    if (!uueVarArr2[0].b() || i8 > uwjVar.g) {
                        uwjVar.g = i8;
                    }
                    if (!uueVarArr2[0].b() || uwjVar.h[0] != uwjVar.g) {
                        uue uueVar = uueVarArr2[0];
                        int i10 = uwjVar.h[0];
                        String str = uwjVar.b;
                        uue uueVarP = uudVar2.P();
                        if (uueVarP.b()) {
                            int i11 = uwjVar.f;
                            uudVar2.z(uueVarP, i11, uwjVar.g, 2, 1);
                            if (uueVar.b()) {
                                vaq.d();
                                woy.Z(uueVar.b());
                                woy.Z(uueVarP.b());
                                int[] iArr = uudVar2.l;
                                iArr[0] = 0;
                                GLES20.glGenFramebuffers(1, iArr, 0);
                                int i12 = iArr[0];
                                woy.Z(i12 != -1);
                                GLES20.glBindFramebuffer(36160, i12);
                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, uueVar.d, 0);
                                uudVar2.x(1, uueVarP);
                                GLES20.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, i11, i10);
                                GLES20.glBindFramebuffer(36160, 0);
                                woy.Z(i12 != 0);
                                iArr[0] = i12;
                                GLES20.glDeleteFramebuffers(1, iArr, 0);
                            }
                        }
                        if (uueVar.b()) {
                            uudVar2.i(uueVar);
                        }
                        uwjVar.e[0] = uueVarP;
                        uwjVar.h[0] = uwjVar.g;
                    }
                    uudVar2.x(1, uwjVar.a());
                }
            }
            Iterator<aewx> it = uwdVar.iterator();
            while (it.hasNext()) {
                aewx next = it.next();
                uwi uwiVar = (uwi) next.getKey();
                Bitmap bitmap = (Bitmap) next.getValue();
                if (bitmap.isRecycled()) {
                    ((ynz) ((ynz) e.g()).ai(9693)).u("Bitmap is recycled in TextureAtlas2 during uploadPendingBlocks(), which may result in a crash.");
                }
                fdi.a("texelBytes", bitmap.getWidth() * bitmap.getHeight() * 4);
                uwj uwjVar2 = this.f;
                int i13 = uwiVar.b;
                int i14 = uwiVar.c;
                int i15 = uwiVar.f;
                int i16 = uwiVar.g;
                int i17 = uwiVar.j;
                int i18 = uwiVar.k;
                uud uudVar3 = uwjVar2.c;
                if (uudVar3 == null) {
                    ((ynz) ((ynz) uwj.a.g()).ai((char) 9709)).u("upload - Context is lost.");
                    c = c3;
                } else {
                    c = c3;
                    if (uwjVar2.i <= 0) {
                        ((ynz) ((ynz) uwj.a.g()).ai((char) 9708)).u("upload - Not bound for upload.");
                    } else if (bitmap.getWidth() <= 0) {
                        ((ynz) ((ynz) uwj.a.g()).ai((char) 9707)).u("upload - Invalid texture width.");
                    } else if (bitmap.getHeight() <= 0) {
                        ((ynz) ((ynz) uwj.a.g()).ai((char) 9706)).u("upload - Invalid texture height.");
                    } else if ((bitmap.getWidth() + i17) - i18 > i15) {
                        ((ynz) ((ynz) uwj.a.g()).ai((char) 9705)).u("upload - Sub-block does not fit.");
                    } else if ((bitmap.getHeight() + i17) - i18 > i16) {
                        ((ynz) ((ynz) uwj.a.g()).ai((char) 9704)).u("upload - Sub-block does not fit.");
                    } else {
                        vaq.d();
                        if (i13 >= i18) {
                            i13 -= i18;
                        }
                        if (i14 >= i18) {
                            i14 -= i18;
                        }
                        if (bitmap.getWidth() + i13 > uwjVar2.f) {
                            ((ynz) ((ynz) uwj.a.g()).ai(9703)).u("upload - bitmap is too large for atlas.");
                        } else if (bitmap.getHeight() + i14 > uwjVar2.g) {
                            ((ynz) ((ynz) uwj.a.g()).ai(9702)).u("upload - bitmap is too large for atlas.");
                        } else {
                            if (i17 > 0) {
                                int width = bitmap.getWidth();
                                int i19 = width + 2;
                                int height = bitmap.getHeight();
                                int i20 = height + 2;
                                int i21 = i13 - 1;
                                int i22 = i14 - 1;
                                int width2 = i13 + bitmap.getWidth();
                                int height2 = i14 + bitmap.getHeight();
                                if (i13 <= 0) {
                                    i19 = width + 1;
                                    i = i13;
                                } else {
                                    i = i21;
                                }
                                if (i14 <= 0) {
                                    i20 = height + 1;
                                    i2 = i14;
                                } else {
                                    i2 = i22;
                                }
                                byte[] bArr2 = new byte[Math.max(i19, i20) * 4];
                                if (i14 > 0) {
                                    bArr = bArr2;
                                    i3 = i19;
                                    uudVar3.I(i, i2, i3, 1, bArr);
                                    i4 = i2;
                                } else {
                                    bArr = bArr2;
                                    i3 = i19;
                                    i4 = i2;
                                }
                                uudVar3.I(i, height2, i3, 1, bArr);
                                if (i13 > 0) {
                                    i5 = i20;
                                    i6 = i4;
                                    uudVar3.I(i, i6, 1, i5, bArr);
                                } else {
                                    i5 = i20;
                                    i6 = i4;
                                }
                                uudVar3.I(width2, i6, 1, i5, bArr);
                            }
                            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                                new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
                                uud.J(i13, i14, bitmapCreateBitmap);
                            } else {
                                uud.J(i13, i14, bitmap);
                            }
                            uwjVar2.j++;
                            c3 = c;
                        }
                    }
                }
                uwe uweVar2 = this.d;
                synchronized (uweVar2) {
                    uweVar2.a(uwiVar);
                }
                c3 = c;
            }
            uwj uwjVar3 = this.f;
            if (uwjVar3.c != null) {
                int i23 = uwjVar3.i;
                if (i23 == 0) {
                    ((ynz) ((ynz) uwj.a.h()).ai((char) 9701)).u("unbindForUpload - Not bound for upload.");
                } else if (i23 > 1) {
                    uwjVar3.i = i23 - 1;
                } else {
                    uwjVar3.i = 0;
                }
            }
            fdi.a("texelBytes", 0);
        }
    }

    @ResultIgnorabilityUnspecified
    public final uwf j(int i, int i2, int i3) {
        int iA;
        synchronized (this.a) {
            ajlp ajlpVar = (ajlp) this.c.h(i);
            boolean z = false;
            if (ajlpVar != null) {
                iA = ((uwi) ajlpVar.b).l;
                woy.Z(iA != -1);
                woy.Z(ajlpVar.a > 0);
            } else {
                iA = this.b.a(i2 + 1, i3 + 1);
            }
            if (iA < 0) {
                return new uwf(iA, false);
            }
            uwh uwhVar = this.b;
            int iD = uwhVar.d(iA);
            int iE = uwhVar.e(iA);
            if (iD > 0 && iE > 0) {
                z = true;
            }
            return new uwf(iA, z);
        }
    }
}
