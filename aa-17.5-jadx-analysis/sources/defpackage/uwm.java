package defpackage;

import android.graphics.Bitmap;
import android.opengl.ETC1Util;
import android.opengl.GLUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class uwm {
    private uud a;
    public final String b;
    public uuz c;
    public final int g;
    private final int i;
    uue d = uue.a;
    private int h = 0;
    public final uwv e = new uwv();
    public long f = -9223372036854775807L;

    public uwm(String str, uuz uuzVar, int i, int i2) {
        this.c = null;
        this.b = str;
        this.c = uuzVar;
        this.i = i;
        if (uuzVar != null && !uuzVar.i) {
            i2 = 1;
        }
        this.g = i2;
    }

    public final void b(uud uudVar) throws IOException {
        int i;
        int i2 = this.h + 1;
        this.h = i2;
        if (i2 == 1) {
            uue uueVarP = uudVar.P();
            this.d = uueVarP;
            uuz uuzVar = this.c;
            if (uuzVar != null) {
                int i3 = this.i;
                int i4 = this.g;
                usq usqVar = uuzVar.c;
                if (usqVar != null) {
                    uuzVar.a = usqVar.a();
                } else {
                    utc utcVar = uuzVar.j;
                    if (utcVar != null) {
                        ajll ajllVar = utcVar.a;
                        utcVar.a = null;
                        uuzVar.k = ajllVar;
                    }
                }
                Bitmap bitmap = uuzVar.a;
                if (bitmap != null) {
                    uue uueVar = uudVar.o[0];
                    uudVar.x(1, uueVarP);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    uudVar.y(i3, i4);
                    uudVar.x(1, uueVar);
                    uueVarP.e = bitmap.getWidth() * bitmap.getHeight() * 4;
                    if (usqVar != null) {
                        uuzVar.a = null;
                    }
                } else {
                    byte[] bArr = uuzVar.b;
                    if (bArr != null) {
                        int i5 = uuzVar.d;
                        if (i5 == 1) {
                            i = 6409;
                        } else if (i5 == 2) {
                            i = 6410;
                        } else if (i5 == 3) {
                            i = 6407;
                        } else {
                            if (i5 != 4) {
                                throw new IllegalArgumentException("Bad number of channels in ImageData buffer");
                            }
                            i = 6408;
                        }
                        uudVar.A(uueVarP, i, uuzVar.g, uuzVar.h, i3, i4, uudVar.B(bArr, bArr.length));
                    } else {
                        ajll ajllVar2 = uuzVar.k;
                        if (ajllVar2 != null) {
                            uue uueVar2 = uudVar.o[0];
                            uudVar.x(1, uueVarP);
                            Object obj = ajllVar2.c;
                            try {
                                ETC1Util.loadTexture(3553, 0, 0, 6408, 33635, new ByteArrayInputStream((byte[]) obj));
                            } catch (IOException e) {
                                ((ynz) ((ynz) ((ynz) uud.a.g()).p(e)).ai((char) 9672)).u("GlContext error in uploadCompressedTexture:");
                            }
                            uudVar.y(i3, i4);
                            uudVar.x(1, uueVar2);
                            uueVarP.e = ((byte[]) obj).length;
                            uuzVar.k = null;
                        } else {
                            uudVar.z(uueVarP, uuzVar.e, uuzVar.f, i3, i4);
                        }
                    }
                }
            }
            this.a = uudVar;
        }
    }

    public final void c(boolean z) {
        woy.Z(this.h > 0);
        int i = this.h - 1;
        this.h = i;
        if (i != 0 || z) {
            return;
        }
        uud uudVar = this.a;
        uudVar.getClass();
        uudVar.i(this.d);
    }

    public final void d(uuz uuzVar) {
        if (e()) {
            throw new RuntimeException("Must be called BEFORE set live");
        }
        this.c = uuzVar;
    }

    public final boolean e() {
        return this.h > 0;
    }
}
