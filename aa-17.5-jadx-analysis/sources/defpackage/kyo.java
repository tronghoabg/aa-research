package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class kyo implements mnd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kyo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        int i = this.b;
        ArrayList arrayList = null;
        if (i == 0) {
            ((kyw) this.a).W(new rzj(printWriter, null));
            return;
        }
        if (i == 1) {
            rzj rzjVar = new rzj(printWriter, null);
            yfq yfqVarB = ((kyk) this.a).b.b();
            if (yfqVarB.isEmpty()) {
                rzjVar.h("No diagnostics sessions recorded", new Object[0]);
                return;
            }
            rzj rzjVarG = rzjVar.g("Audio silence diagnostics from the last %d voice sessions: ", Integer.valueOf(yfqVarB.size()));
            rzjVarG.k(yfqVarB, new kzp(rzjVar, 8));
            rzjVarG.l();
            return;
        }
        if (i == 2) {
            printWriter.println("Dashboard Fragment");
            mtz mtzVar = (mtz) this.a;
            Object objE = mtzVar.f.e();
            Objects.toString(objE);
            printWriter.println("  Shown: ".concat(String.valueOf(objE)));
            Object objE2 = mtzVar.d.e();
            Objects.toString(objE2);
            printWriter.println("  Frozen: ".concat(String.valueOf(objE2)));
            Object objE3 = mtzVar.c.e();
            Objects.toString(objE3);
            printWriter.println("  Swipe progress: ".concat(String.valueOf(objE3)));
            Object objE4 = mtzVar.g.e();
            Objects.toString(objE4);
            printWriter.println("  Option from ViewModel: ".concat(String.valueOf(objE4)));
            return;
        }
        if (i == 3) {
            yph yphVar = myi.a;
            printWriter.println("MediaPlayerFragment");
            printWriter.getClass();
            ((mzy) this.a).t(printWriter);
            return;
        }
        if (i == 4) {
            int i2 = nca.a;
            printWriter.println("NavigationSuggestions card");
            printWriter.getClass();
            List<ncd> list = (List) ((ncr) this.a).a.e();
            if (list != null) {
                arrayList = new ArrayList(woy.bp(list, 10));
                for (ncd ncdVar : list) {
                    arrayList.add("NavigationSuggestionItem(name=" + ((Object) ncdVar.b) + ", subText=" + ((Object) ncdVar.c) + ", subTextColor=" + ncdVar.d + ", icon=" + ncdVar.a + ")");
                }
            }
            Objects.toString(arrayList);
            printWriter.println("suggestionItems = ".concat(String.valueOf(arrayList)));
            return;
        }
        if (i != 5) {
            printWriter.println("TelecomCallCard");
            printWriter.getClass();
            nea neaVar = (nea) this.a;
            printWriter.println(afyh.a("\n      title = " + neaVar.m.e() + " subtitle = " + neaVar.n.e() + "\n      imageInfo = " + neaVar.o.e() + " badgeIcon = " + neaVar.p.e() + "\n      firstAction = " + neaVar.q.e() + " secondAction = " + neaVar.r.e() + "\n      "));
            return;
        }
        aezr aezrVar = ndj.a;
        printWriter.println("Notification card");
        printWriter.getClass();
        ndp ndpVar = (ndp) this.a;
        printWriter.println(afyh.a("\n          notificationEntry = " + ndpVar.b.e() + " packageName = " + ndpVar.f.e() + "\n          title = " + ndpVar.g.e() + " subtitle = " + ndpVar.i.e() + " largeIcon = " + ndpVar.j.e() + "\n          smallIcon = " + ndpVar.m.e() + "\n        "));
        Object objE5 = ndpVar.n.e();
        StringBuilder sb = new StringBuilder("\n          action1 = ");
        sb.append(objE5);
        sb.append("\n        ");
        printWriter.println(afyh.a(sb.toString()));
        Object objE6 = ndpVar.o.e();
        StringBuilder sb2 = new StringBuilder("\n          action2 = ");
        sb2.append(objE6);
        sb2.append("\n        ");
        printWriter.println(afyh.a(sb2.toString()));
        printWriter.println(afyh.a("\n          primaryAction = " + ndpVar.p.e() + "\n        "));
    }
}
