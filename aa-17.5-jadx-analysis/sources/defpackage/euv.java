package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* loaded from: classes2.dex */
final class euv implements Comparable {
    public String a;
    public String b;

    public euv(String str) {
        List listBg;
        List listCd;
        str.getClass();
        Matcher matcher = new aisp("/").a.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listBg = arrayList;
        } else {
            listBg = woy.bg(str);
        }
        if (listBg.isEmpty()) {
            listCd = afbe.a;
        } else {
            ListIterator listIterator = listBg.listIterator(listBg.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listCd = woy.cd(listBg, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listCd = afbe.a;
        }
        this.a = (String) listCd.get(0);
        this.b = (String) listCd.get(1);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(euv euvVar) {
        euvVar.getClass();
        int i = true != affa.f(this.a, euvVar.a) ? 0 : 2;
        return affa.f(this.b, euvVar.b) ? i + 1 : i;
    }
}
