package defpackage;

import android.view.DragEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class cgs implements View.OnDragListener {
    public final cgu a = new cgu(null);
    public final yy b = new yy(0);
    public final cfy c = new cxt<cgu>() { // from class: cgs.1
        @Override // defpackage.cxt
        public final /* bridge */ /* synthetic */ cfx d() {
            return cgs.this.a;
        }

        @Override // defpackage.cxt
        public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return cgs.this.a.hashCode();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        sm smVar = new sm(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                cgu cguVar = this.a;
                affq affqVar = new affq();
                xb.c(cguVar, new bml(affqVar, 20));
                boolean z = affqVar.a;
                yx yxVar = new yx(this.b);
                while (yxVar.hasNext()) {
                }
                break;
            case 2:
                this.a.d(smVar);
                break;
            case 4:
                xb.c(this.a, new bmk(19));
                this.b.clear();
            case 3:
                return false;
            case 6:
                this.a.b(smVar);
            case 5:
                return false;
        }
        return false;
    }
}
