package defpackage;

import android.content.Context;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class ick implements huo {
    private static final htm c = new htm((byte[]) null, (byte[]) null, (byte[]) null);
    private final Context a;
    private final List b;
    private final htm d;
    private final ieb e;

    public ick(Context context, List list, hxe hxeVar, hxl hxlVar) {
        htm htmVar = c;
        this.a = context.getApplicationContext();
        this.b = list;
        this.e = new ieb(hxeVar, hxlVar);
        this.d = htmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0396 A[Catch: all -> 0x03ad, TryCatch #4 {all -> 0x03ad, blocks: (B:3:0x0016, B:138:0x0301, B:140:0x0307, B:141:0x031c, B:146:0x0340, B:148:0x0346, B:149:0x035d, B:151:0x0366, B:162:0x038f, B:166:0x03ac, B:165:0x0396), top: B:176:0x0016 }] */
    @Override // defpackage.huo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.hwx a(java.lang.Object r19, int r20, int r21, defpackage.hum r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ick.a(java.lang.Object, int, int, hum):hwx");
    }

    @Override // defpackage.huo
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hum humVar) throws IOException {
        return !((Boolean) humVar.b(ics.b)).booleanValue() && hdt.m(this.b, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }
}
