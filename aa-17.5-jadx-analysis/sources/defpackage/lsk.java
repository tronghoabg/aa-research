package defpackage;

import android.content.ComponentName;
import android.net.Uri;

/* loaded from: classes2.dex */
final class lsk extends lsd {
    private final boolean c;
    private final CharSequence d;
    private final CharSequence e;
    private final CharSequence f;
    private final boolean g;
    private final Uri h;

    public lsk(ComponentName componentName, lmd lmdVar) {
        super(componentName);
        this.c = lmdVar == null;
        lmc lmcVar = (lmc) spu.aT(lmdVar, new llx(16));
        this.d = (CharSequence) spu.aT(lmcVar, new llx(17));
        this.e = (CharSequence) spu.aT(lmcVar, new llx(18));
        this.f = (CharSequence) spu.aT(lmcVar, new llx(19));
        this.g = spu.aT(lmdVar, new llx(20)) != null;
        this.h = (Uri) spu.aT(lmdVar, new lst(1));
    }

    @Override // defpackage.lsd
    protected final String a() {
        StringBuilder sb = new StringBuilder("METADATA ");
        if (this.c) {
            sb.append("null");
        } else {
            sb.append("title=");
            sb.append(this.d);
            sb.append(" subtitle=");
            sb.append(this.e);
            sb.append(" description=");
            sb.append(this.f);
            sb.append(" has_icon_bitmap=");
            sb.append(this.g);
            sb.append(" icon_uri=");
            sb.append(this.h);
        }
        return sb.toString();
    }
}
