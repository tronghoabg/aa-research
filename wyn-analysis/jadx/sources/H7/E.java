package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabl;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaco;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbadf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaeq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbagk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaia;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaiy;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbat;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcl;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbea;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zben;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbgl;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbid;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbip;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjg;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbni;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbro;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbt;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbzv;

/* loaded from: classes4.dex */
public final class E extends zbub {
    private static final E zbd;
    private zbz zbA;
    private zbjp zbC;
    private zbip zbD;
    private d0 zbE;
    private zbzv zbF;
    private zbabl zbG;
    private zbt zbH;
    private zbni zbJ;
    private zbq zbK;
    private zbaia zbL;
    private zbaia zbM;
    private zbaia zbN;
    private int zbe;
    private int zbf;
    private long zbg;
    private zbgl zbh;
    private zbjp zbi;
    private zbip zbj;
    private zbid zbk;
    private int zbl;
    private zbaco zbm;
    private zbro zbn;
    private zbadf zbo;
    private zbjg zbp;
    private zben zbq;
    private zbcw zbr;
    private zbcl zbs;
    private zbaiy zbt;
    private M zbu;
    private boolean zbv;
    private zbat zbw;
    private zbagk zbx;
    private zbaeq zby;
    private C0577p zbz;
    private byte zbO = 2;
    private zbun zbB = zbuf.zby();
    private String zbI = "";

    static {
        E e7 = new E();
        zbd = e7;
        zbuf.zbD(E.class, e7);
    }

    public static E a() {
        return zbd;
    }

    public static E b(byte[] bArr, zbtp zbtpVar) {
        return (E) zbuf.zbu(zbd, bArr, zbtpVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbO);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbd, "\u0001\"\u0000\u0002\u0001'\"\u0000\u0001\t\u0001ဂ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nဉ\t\u000bᐉ\n\fဉ\u000e\rဉ\u000b\u000eဉ\r\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဉ\f\u0013ᐉ\u0011\u0014ဉ\u0012\u0015ᐉ\u0013\u0016ဉ\u0014\u0018\u001b\u0019ဉ\u0017\u001aဉ\u0018\u001bᐉ\u0015\u001eဉ\u0016\u001fᐉ\u0019!ဉ\u001a\"ဈ\u001b#ဉ\u001c$ဉ\u001d%ဉ\u001e&ဉ\u001f'ဉ ", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", zbea.zba(), "zbm", "zbn", "zbo", "zbp", "zbq", "zbu", "zbr", "zbt", "zbv", "zbw", "zbs", "zbx", "zby", "zbz", "zbA", "zbB", H.class, "zbE", "zbF", "zbC", "zbD", "zbG", "zbH", "zbI", "zbJ", "zbK", "zbL", "zbM", "zbN"});
        }
        if (i10 == 3) {
            return new E();
        }
        if (i10 == 4) {
            return new D(zbd);
        }
        if (i10 == 5) {
            return zbd;
        }
        this.zbO = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final zbabl zbe() {
        zbabl zbablVar = this.zbG;
        return zbablVar == null ? zbabl.zbe() : zbablVar;
    }
}
