package defpackage;

import android.os.IBinder;
import androidx.car.app.model.Alert;
import androidx.car.app.suggestion.model.Suggestion;
import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hfe extends fud {
    public static final yob c = yob.c("com/android/car/libraries/apphost/suggestion/SuggestionHost");
    public List d;
    public final gms e;
    private final hfd f;

    public hfe(geu geuVar, gms gmsVar) {
        super(geuVar, "CarApp.H.Sug");
        this.f = new hfd(this);
        this.e = gmsVar;
    }

    @Override // defpackage.fud, defpackage.gnp
    public final void p(PrintWriter printWriter) {
        printWriter.print("Current Suggestions:");
        mnf mnfVar = new mnf();
        mnfVar.g = "--empty--";
        mnfVar.e = Alert.DURATION_SHOW_INDEFINITELY;
        mnfVar.h = true;
        mnfVar.f = true;
        mnfVar.i = (byte) 127;
        mng mngVarA = hhj.a();
        mngVarA.a = "ID";
        mngVarA.f();
        mngVarA.g('|');
        mngVarA.h(true);
        mnfVar.d(mngVarA.e());
        mng mngVarA2 = hhj.a();
        mngVarA2.a = "Title";
        mngVarA2.f();
        mngVarA2.g('|');
        mngVarA2.h(true);
        mnfVar.d(mngVarA2.e());
        mng mngVarA3 = hhj.a();
        mngVarA3.a = "Subtitle";
        mngVarA3.f();
        mngVarA3.g('|');
        mngVarA3.h(true);
        mnfVar.d(mngVarA3.e());
        mng mngVarA4 = hhj.a();
        mngVarA4.a = "Action";
        mngVarA4.f();
        mngVarA4.g('|');
        mngVarA4.h(true);
        mnfVar.d(mngVarA4.e());
        List list = this.d;
        if (list != null && !list.isEmpty()) {
            for (Suggestion suggestion : this.d) {
                Object[] objArr = {suggestion.getIdentifier(), suggestion.getTitle(), suggestion.getSubtitle(), suggestion.getAction()};
                if (mnfVar.c == null) {
                    int i = yfq.d;
                    mnfVar.c = new yfl(4);
                }
                mnfVar.c.i(DesugarCollections.unmodifiableList(Arrays.asList(objArr)));
            }
        }
        yfl yflVar = mnfVar.a;
        if (yflVar != null) {
            mnfVar.b = yflVar.g();
        } else if (mnfVar.b == null) {
            int i2 = yfq.d;
            mnfVar.b = yls.a;
        }
        yfl yflVar2 = mnfVar.c;
        if (yflVar2 != null) {
            mnfVar.d = yflVar2.g();
        } else if (mnfVar.d == null) {
            int i3 = yfq.d;
            mnfVar.d = yls.a;
        }
        if (mnfVar.i != 127) {
            StringBuilder sb = new StringBuilder();
            if ((mnfVar.i & 1) == 0) {
                sb.append(" minWidth");
            }
            if ((mnfVar.i & 2) == 0) {
                sb.append(" maxWidth");
            }
            if ((mnfVar.i & 4) == 0) {
                sb.append(" showColumnNames");
            }
            if ((mnfVar.i & 8) == 0) {
                sb.append(" useEllipsis");
            }
            if ((mnfVar.i & 16) == 0) {
                sb.append(" isMultiline");
            }
            if ((mnfVar.i & 32) == 0) {
                sb.append(" headerBorder");
            }
            if ((mnfVar.i & 64) == 0) {
                sb.append(" hideEmptyColumns");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        final hhh hhhVar = new hhh(mnfVar.b, mnfVar.d, mnfVar.e, mnfVar.f, mnfVar.g, mnfVar.h);
        Set set = Collections.EMPTY_SET;
        int size = set.size();
        int i4 = ((yls) hhhVar.a).c;
        boolean z = size == i4 || hhhVar.b.isEmpty();
        if (hhhVar.c) {
            hhhVar.l(printWriter, new hhk() { // from class: hhi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hhk
                public final String a(int i5) {
                    return ((hhj) ((hhh) hhhVar).a.get(i5)).a;
                }
            }, true, z ? Collections.EMPTY_SET : set);
        }
        if (z) {
            String str = hhhVar.d;
            if (str != null) {
                printWriter.println(str);
                return;
            }
            return;
        }
        yfq yfqVar = hhhVar.b;
        for (int i5 = 0; i5 < ((yls) yfqVar).c; i5++) {
            List list2 = (List) yfqVar.get(i5);
            if (list2.size() != i4) {
                throw new IllegalArgumentException("Row has fewer columns than required.");
            }
            hhhVar.l(printWriter, new hhl(list2), false, set);
        }
    }

    @Override // defpackage.fuh
    public final /* bridge */ /* synthetic */ IBinder q() {
        g();
        return this.f;
    }
}
