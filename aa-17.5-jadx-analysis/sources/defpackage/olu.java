package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class olu {
    public final olv a;
    public final View.OnClickListener b;
    public final onm c;

    public olu(olv olvVar, View.OnClickListener onClickListener, onm onmVar) {
        this.a = olvVar;
        this.b = onClickListener;
        this.c = onmVar;
    }

    public static se a() {
        se seVar = new se(null);
        seVar.c = onm.SECONDARY;
        return seVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof olu) {
            olu oluVar = (olu) obj;
            if (this.a.equals(oluVar.a) && this.b.equals(oluVar.b) && this.c.equals(oluVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        onm onmVar = this.c;
        View.OnClickListener onClickListener = this.b;
        return "ButtonModel{label=null, icon=" + String.valueOf(this.a) + ", onClickListener=" + String.valueOf(onClickListener) + ", style=" + String.valueOf(onmVar) + "}";
    }

    public olu() {
        throw null;
    }
}
