package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class lsm extends lsd {
    private final int c;
    private final long d;
    private final long e;

    /* JADX WARN: Multi-variable type inference failed */
    public lsm(ComponentName componentName, yfq yfqVar) {
        long j;
        super(componentName);
        int size = yfqVar.size();
        this.c = size;
        if (size > 0) {
            this.d = ((llu) yfqVar.get(0)).h().n().getLong("QUEUE_ID");
            j = ((llu) yrm.an(yfqVar)).h().n().getLong("QUEUE_ID");
        } else {
            j = -1;
            this.d = -1L;
        }
        this.e = j;
    }

    @Override // defpackage.lsd
    protected final String a() {
        StringBuilder sb = new StringBuilder("QUEUE size=");
        int i = this.c;
        sb.append(i);
        if (i > 0) {
            sb.append(" start_id=");
            sb.append(this.d);
            sb.append(" end_id=");
            sb.append(this.e);
        }
        return sb.toString();
    }
}
