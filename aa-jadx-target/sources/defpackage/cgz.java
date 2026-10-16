package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cgz implements android.view.View.OnDragListener {
    public final defpackage.chb a = new defpackage.chb(null);
    public final defpackage.zf b = new defpackage.zf(0);
    public final defpackage.cgf c = new defpackage.cyc<defpackage.chb>() { // from class: cgz.1
        @Override // defpackage.cyc
        public final /* bridge */ /* synthetic */ defpackage.cge d() {
            return defpackage.cgz.this.a;
        }

        @Override // defpackage.cyc
        public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        }

        public final boolean equals(java.lang.Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return defpackage.cgz.this.a.hashCode();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(android.view.View view, android.view.DragEvent dragEvent) {
        defpackage.sr srVar = new defpackage.sr(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                defpackage.chb chbVar = this.a;
                defpackage.afgq afgqVar = new defpackage.afgq();
                defpackage.cdp.b(chbVar, new defpackage.bmp(afgqVar, 20));
                boolean z = afgqVar.a;
                defpackage.ze zeVar = new defpackage.ze(this.b);
                while (zeVar.hasNext()) {
                }
                return z;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                this.a.d(srVar);
                return false;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cdp.b(this.a, new defpackage.bmo(19));
                this.b.clear();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return false;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                this.a.b(srVar);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return false;
            default:
                return false;
        }
    }
}
