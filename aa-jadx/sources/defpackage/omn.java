package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class omn {
    public final defpackage.omo a;
    public final android.view.View.OnClickListener b;
    public final defpackage.ooe c;

    public omn(defpackage.omo omoVar, android.view.View.OnClickListener onClickListener, defpackage.ooe ooeVar) {
        this.a = omoVar;
        this.b = onClickListener;
        this.c = ooeVar;
    }

    public static defpackage.sj a() {
        defpackage.sj sjVar = new defpackage.sj(null);
        sjVar.c = defpackage.ooe.SECONDARY;
        return sjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.omn) {
            defpackage.omn omnVar = (defpackage.omn) obj;
            if (this.a.equals(omnVar.a) && this.b.equals(omnVar.b) && this.c.equals(omnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.ooe ooeVar = this.c;
        android.view.View.OnClickListener onClickListener = this.b;
        return "ButtonModel{label=null, icon=" + java.lang.String.valueOf(this.a) + ", onClickListener=" + java.lang.String.valueOf(onClickListener) + ", style=" + java.lang.String.valueOf(ooeVar) + "}";
    }

    public omn() {
        throw null;
    }
}
