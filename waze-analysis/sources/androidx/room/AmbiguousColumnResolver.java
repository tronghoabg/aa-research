package androidx.room;

import androidx.autofill.HintConstants;
import e.c.d.a;
import h.a.aj;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    /* compiled from: WazeSource */
    final class Match {
        private final List<Integer> resultIndices;
        private final j resultRange;

        public Match(j jVar, List<Integer> list) {
            x.f(jVar, "resultRange");
            x.f(list, "resultIndices");
            this.resultRange = jVar;
            this.resultIndices = list;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        public final j getResultRange() {
            return this.resultRange;
        }
    }

    /* compiled from: WazeSource */
    final class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String str, int i2) {
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            this.name = str;
            this.index = i2;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i3 & 2) != 0) {
                i2 = resultColumn.index;
            }
            return resultColumn.copy(str, i2);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.index;
        }

        public final ResultColumn copy(String str, int i2) {
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            return new ResultColumn(str, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            return x.n(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.index;
        }

        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i2, l<? super List<? extends T>, ab> lVar) {
        if (i2 == list.size()) {
            lVar.invoke(i.ao(list2));
            return;
        }
        Iterator<T> it = list.get(i2).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            INSTANCE.dfs(list, list2, i2 + 1, lVar);
            list2.remove(i.e(list2));
        }
    }

    static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i2, l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i2, lVar);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, q<? super Integer, ? super Integer, ? super List<ResultColumn>, ab> qVar) {
        int i2 = 0;
        int iHashCode = 0;
        for (String str : strArr) {
            iHashCode += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                qVar.invoke(Integer.valueOf(i2), Integer.valueOf(length), list.subList(i2, length));
            }
            int i3 = i2 + 1;
            int i4 = length + 1;
            if (i4 > list.size()) {
                return;
            }
            iHashCode2 = (iHashCode2 - list.get(i2).getName().hashCode()) + list.get(length).getName().hashCode();
            i2 = i3;
            length = i4;
        }
    }

    public static final int[][] resolve(String[] strArr, String[][] strArr2) {
        x.f(strArr, "resultColumns");
        x.f(strArr2, "mappings");
        int length = strArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String strSubstring = strArr[i3];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                x.e(strSubstring, "substring(...)");
            }
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            x.e(lowerCase, "toLowerCase(...)");
            strArr[i3] = lowerCase;
        }
        String[][] strArr3 = strArr2;
        int length2 = strArr3.length;
        for (int i4 = 0; i4 < length2; i4++) {
            int length3 = strArr2[i4].length;
            for (int i5 = 0; i5 < length3; i5++) {
                String[] strArr4 = strArr2[i4];
                String lowerCase2 = strArr4[i5].toLowerCase(Locale.ROOT);
                x.e(lowerCase2, "toLowerCase(...)");
                strArr4[i5] = lowerCase2;
            }
        }
        Set setM = a.m();
        for (String[] strArr5 : strArr3) {
            i.aF(setM, strArr5);
        }
        Set setL = a.l(setM);
        List listB = i.b();
        int length4 = strArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length4) {
            String str = strArr[i6];
            int i8 = i7 + 1;
            if (setL.contains(str)) {
                listB.add(new ResultColumn(str, i7));
            }
            i6++;
            i7 = i8;
        }
        List<ResultColumn> listA = i.a(listB);
        int length5 = strArr3.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i9 = 0; i9 < length5; i9++) {
            arrayList.add(new ArrayList());
        }
        final ArrayList arrayList2 = arrayList;
        int length6 = strArr3.length;
        int i10 = 0;
        final int i11 = 0;
        while (i10 < length6) {
            int i12 = i11 + 1;
            final String[] strArr6 = strArr3[i10];
            INSTANCE.rabinKarpSearch(listA, strArr6, new q() { // from class: androidx.room.AmbiguousColumnResolver$$ExternalSyntheticLambda0
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AmbiguousColumnResolver.resolve$lambda$16$lambda$7(strArr6, arrayList2, i11, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (List) obj3);
                }
            });
            if (((List) arrayList2.get(i11)).isEmpty()) {
                int length7 = strArr6.length;
                ArrayList arrayList3 = new ArrayList(length7);
                for (int i13 = i2; i13 < length7; i13++) {
                    String str2 = strArr6[i13];
                    List listB2 = i.b();
                    for (ResultColumn resultColumn : listA) {
                        if (x.n(str2, resultColumn.getName())) {
                            listB2.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List listA2 = i.a(listB2);
                    if (listA2.isEmpty()) {
                        throw new IllegalStateException("Column " + str2 + " not found in result");
                    }
                    arrayList3.add(listA2);
                }
                dfs$default(INSTANCE, arrayList3, null, 0, new l() { // from class: androidx.room.AmbiguousColumnResolver$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return AmbiguousColumnResolver.resolve$lambda$16$lambda$15(arrayList2, i11, (List) obj);
                    }
                }, 6, null);
            }
            i10++;
            i11 = i12;
            i2 = 0;
        }
        ArrayList arrayList4 = arrayList2;
        if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings");
                }
            }
        }
        final aq aqVar = new aq();
        aqVar.f48105a = Solution.Companion.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList2, null, 0, new l() { // from class: androidx.room.AmbiguousColumnResolver$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AmbiguousColumnResolver.resolve$lambda$19(aqVar, (List) obj);
            }
        }, 6, null);
        List<Match> matches = ((Solution) aqVar.f48105a).getMatches();
        ArrayList arrayList5 = new ArrayList(i.q(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList5.add(i.aA(((Match) it2.next()).getResultIndices()));
        }
        return (int[][]) arrayList5.toArray(new int[0][]);
    }

    static final ab resolve$lambda$16$lambda$15(List list, int i2, List list2) {
        x.f(list2, "indices");
        List list3 = list2;
        Iterator it = list3.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((Number) it.next()).intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        Iterator it2 = list3.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue3 = ((Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int iIntValue4 = ((Number) it2.next()).intValue();
            if (iIntValue3 < iIntValue4) {
                iIntValue3 = iIntValue4;
            }
        }
        ((List) list.get(i2)).add(new Match(new j(iIntValue, iIntValue3), list2));
        return ab.f48028a;
    }

    static final ab resolve$lambda$16$lambda$7(String[] strArr, List list, int i2, int i3, int i4, List list2) {
        Object next;
        x.f(list2, "resultColumnsSublist");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (x.n(str, ((ResultColumn) next).component1())) {
                    break;
                }
            }
            ResultColumn resultColumn = (ResultColumn) next;
            if (resultColumn == null) {
                return ab.f48028a;
            }
            arrayList.add(Integer.valueOf(resultColumn.getIndex()));
        }
        ((List) list.get(i2)).add(new Match(new j(i3, i4 - 1), arrayList));
        return ab.f48028a;
    }

    static final ab resolve$lambda$19(aq aqVar, List list) {
        x.f(list, "it");
        Solution solutionBuild = Solution.Companion.build(list);
        if (solutionBuild.compareTo((Solution) aqVar.f48105a) < 0) {
            aqVar.f48105a = solutionBuild;
        }
        return ab.f48028a;
    }

    /* compiled from: WazeSource */
    final class Solution implements Comparable<Solution> {
        public static final Companion Companion = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(i.h(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        public Solution(List<Match> list, int i2, int i3) {
            x.f(list, "matches");
            this.matches = list;
            this.coverageOffset = i2;
            this.overlaps = i3;
        }

        @Override // java.lang.Comparable
        public int compareTo(Solution solution) {
            x.f(solution, "other");
            int iA = x.a(this.overlaps, solution.overlaps);
            return iA != 0 ? iA : x.a(this.coverageOffset, solution.coverageOffset);
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final Solution build(List<Match> list) {
                x.f(list, "matches");
                List<Match> list2 = list;
                int i2 = 0;
                int iB = 0;
                for (Match match : list2) {
                    iB += ((match.getResultRange().b() - match.getResultRange().a()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list2.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iA = ((Match) it.next()).getResultRange().a();
                while (it.hasNext()) {
                    int iA2 = ((Match) it.next()).getResultRange().a();
                    if (iA > iA2) {
                        iA = iA2;
                    }
                }
                Iterator<T> it2 = list2.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iB2 = ((Match) it2.next()).getResultRange().b();
                while (it2.hasNext()) {
                    int iB3 = ((Match) it2.next()).getResultRange().b();
                    if (iB2 < iB3) {
                        iB2 = iB3;
                    }
                }
                Iterable jVar = new j(iA, iB2);
                if (!(jVar instanceof Collection) || !((Collection) jVar).isEmpty()) {
                    Iterator it3 = jVar.iterator();
                    int i3 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((aj) it3).nextInt();
                        Iterator<T> it4 = list2.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((Match) it4.next()).getResultRange().g(iNextInt)) {
                                i4++;
                            }
                            if (i4 > 1) {
                                i3++;
                                if (i3 < 0) {
                                    i.o();
                                }
                            }
                        }
                    }
                    i2 = i3;
                }
                return new Solution(list, iB, i2);
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    public static final int[][] resolve(List<String> list, String[][] strArr) {
        x.f(list, "resultColumns");
        x.f(strArr, "mappings");
        return resolve((String[]) list.toArray(new String[0]), strArr);
    }
}
