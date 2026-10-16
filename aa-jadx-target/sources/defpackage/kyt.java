package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kyt implements defpackage.mnj {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kyt(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        int i = this.b;
        java.util.ArrayList arrayList = null;
        if (i == 0) {
            ((defpackage.kzb) this.a).W(new defpackage.saf(printWriter, null));
            return;
        }
        if (i == 1) {
            defpackage.saf safVar = new defpackage.saf(printWriter, null);
            defpackage.ygw ygwVarB = ((defpackage.kyq) this.a).b.b();
            if (ygwVarB.isEmpty()) {
                safVar.h("No diagnostics sessions recorded", new java.lang.Object[0]);
                return;
            }
            defpackage.saf safVarG = safVar.g("Audio silence diagnostics from the last %d voice sessions: ", java.lang.Integer.valueOf(ygwVarB.size()));
            safVarG.k(ygwVarB, new defpackage.kzu(safVar, 8));
            safVarG.l();
            return;
        }
        if (i == 2) {
            printWriter.println("Dashboard Fragment");
            defpackage.muf mufVar = (defpackage.muf) this.a;
            java.lang.Object objE = mufVar.f.e();
            java.util.Objects.toString(objE);
            printWriter.println("  Shown: ".concat(java.lang.String.valueOf(objE)));
            java.lang.Object objE2 = mufVar.d.e();
            java.util.Objects.toString(objE2);
            printWriter.println("  Frozen: ".concat(java.lang.String.valueOf(objE2)));
            java.lang.Object objE3 = mufVar.c.e();
            java.util.Objects.toString(objE3);
            printWriter.println("  Swipe progress: ".concat(java.lang.String.valueOf(objE3)));
            java.lang.Object objE4 = mufVar.g.e();
            java.util.Objects.toString(objE4);
            printWriter.println("  Option from ViewModel: ".concat(java.lang.String.valueOf(objE4)));
            return;
        }
        if (i == 3) {
            defpackage.yqm yqmVar = defpackage.myx.a;
            printWriter.println("MediaPlayerFragment");
            printWriter.getClass();
            ((defpackage.nan) this.a).t(printWriter);
            return;
        }
        if (i == 4) {
            int i2 = nco.a;
            printWriter.println("NavigationSuggestions card");
            printWriter.getClass();
            java.util.List<ncr> list = (java.util.List) ((ndf) this.a).a.e();
            if (list != null) {
                arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
                for (ncr ncrVar : list) {
                    arrayList.add("NavigationSuggestionItem(name=" + ((java.lang.Object) ncrVar.b) + ", subText=" + ((java.lang.Object) ncrVar.c) + ", subTextColor=" + ncrVar.d + ", icon=" + ncrVar.a + ")");
                }
            }
            java.util.Objects.toString(arrayList);
            printWriter.println("suggestionItems = ".concat(java.lang.String.valueOf(arrayList)));
            return;
        }
        if (i != 5) {
            printWriter.println("TelecomCallCard");
            printWriter.getClass();
            nes nesVar = (nes) this.a;
            printWriter.println(afzh.a("\n      title = " + nesVar.m.e() + " subtitle = " + nesVar.n.e() + "\n      imageInfo = " + nesVar.o.e() + " badgeIcon = " + nesVar.p.e() + "\n      firstAction = " + nesVar.q.e() + " secondAction = " + nesVar.r.e() + "\n      "));
            return;
        }
        defpackage.afar afarVar = ndz.a;
        printWriter.println("Notification card");
        printWriter.getClass();
        neg negVar = (neg) this.a;
        printWriter.println(afzh.a("\n          notificationEntry = " + negVar.b.e() + " packageName = " + negVar.f.e() + "\n          title = " + negVar.g.e() + " subtitle = " + negVar.i.e() + " largeIcon = " + negVar.j.e() + "\n          smallIcon = " + negVar.m.e() + "\n        "));
        java.lang.Object objE5 = negVar.n.e();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n          action1 = ");
        sb.append(objE5);
        sb.append("\n        ");
        printWriter.println(afzh.a(sb.toString()));
        java.lang.Object objE6 = negVar.o.e();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\n          action2 = ");
        sb2.append(objE6);
        sb2.append("\n        ");
        printWriter.println(afzh.a(sb2.toString()));
        printWriter.println(afzh.a("\n          primaryAction = " + negVar.p.e() + "\n        "));
    }
}
