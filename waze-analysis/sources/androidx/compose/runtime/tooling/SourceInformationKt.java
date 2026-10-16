package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.Utils_androidKt;
import h.g.b.x;
import h.n.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SourceInformationKt {
    private static final boolean hasSection(SourceInfoParserState sourceInfoParserState) {
        return sourceInfoParserState.getI() < sourceInfoParserState.getData().length() + (-1) && Character.isLetter(sourceInfoParserState.getData().charAt(sourceInfoParserState.getI())) && sourceInfoParserState.getData().charAt(sourceInfoParserState.getI() + 1) == '(';
    }

    private static final List<LocationSourceInformation> parseLocations(SourceInfoParserState sourceInfoParserState) throws ParseException {
        boolean z;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(':')) {
            if (sourceInfoParserState.matches('*')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf2 = !sourceInfoParserState.matches('@') ? Integer.valueOf(sourceInfoParserState.takeIntUntil("@") + 1) : null;
            SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            int iTakeIntUntil = sourceInfoParserState.takeIntUntil("L,:");
            if (sourceInfoParserState.matches('L')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                numValueOf = Integer.valueOf(sourceInfoParserState.takeIntUntil(",:"));
            } else {
                numValueOf = null;
            }
            arrayList.add(new LocationSourceInformation(numValueOf2 != null ? numValueOf2.intValue() : -1, iTakeIntUntil, numValueOf != null ? numValueOf.intValue() : -1, z));
            if (sourceInfoParserState.matches(',')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            }
        }
        SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
        return arrayList;
    }

    private static final List<ParameterSourceInformation> parseParameterIndex(SourceInfoParserState sourceInfoParserState) throws ParseException, NumberFormatException {
        String strReplaceComposePrefix;
        sourceInfoParserState.advance(2);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(')')) {
            if (sourceInfoParserState.matches('!')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                String strTakeUntil = sourceInfoParserState.takeUntil("!,)");
                if (strTakeUntil.length() != 0) {
                    int i2 = Integer.parseInt(strTakeUntil);
                    int i3 = 0;
                    while (i2 > 0) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                arrayList.add(new ParameterSourceInformation(i3, null, null, 6, null));
                                i2--;
                                break;
                            }
                            if (((ParameterSourceInformation) arrayList.get(i4)).getSortedIndex() == i3) {
                                i3++;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    z = true;
                }
            } else {
                int iTakeIntUntil = sourceInfoParserState.takeIntUntil("!:,)");
                if (sourceInfoParserState.matches(':')) {
                    SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                    strReplaceComposePrefix = replaceComposePrefix(sourceInfoParserState.takeUntil("!,)"));
                } else {
                    strReplaceComposePrefix = null;
                }
                if (z) {
                    int i5 = 0;
                    while (i5 < iTakeIntUntil) {
                        int size2 = arrayList.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                arrayList.add(new ParameterSourceInformation(i5, null, null, 6, null));
                                break;
                            }
                            if (((ParameterSourceInformation) arrayList.get(i6)).getSortedIndex() == i5) {
                                i5++;
                                break;
                            }
                            i6++;
                        }
                    }
                }
                arrayList.add(new ParameterSourceInformation(iTakeIntUntil, null, strReplaceComposePrefix, 2, null));
                z = false;
            }
            if (sourceInfoParserState.matches(',')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            }
        }
        sourceInfoParserState.expect(')');
        SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
        return arrayList;
    }

    private static final List<ParameterSourceInformation> parseParameterNames(SourceInfoParserState sourceInfoParserState) throws ParseException {
        String strReplaceComposePrefix;
        sourceInfoParserState.advance(2);
        ArrayList arrayList = new ArrayList();
        while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(')')) {
            String strTakeUntil = sourceInfoParserState.takeUntil(":,)");
            if (sourceInfoParserState.matches(':')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                strReplaceComposePrefix = replaceComposePrefix(sourceInfoParserState.takeUntil(",)"));
            } else {
                strReplaceComposePrefix = null;
            }
            arrayList.add(new ParameterSourceInformation(arrayList.size(), strTakeUntil, strReplaceComposePrefix));
            if (sourceInfoParserState.matches(',')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            }
        }
        sourceInfoParserState.expect(')');
        SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
        return arrayList;
    }

    public static final SourceInformation parseSourceInformation(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return parseSourceInformationInternal(str);
        } catch (ParseException e2) {
            Utils_androidKt.logError(e2.getMessage(), e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.tooling.SourceInformation parseSourceInformationInternal(java.lang.String r14) throws androidx.compose.runtime.tooling.ParseException, java.lang.NumberFormatException {
        /*
            androidx.compose.runtime.tooling.SourceInfoParserState r0 = new androidx.compose.runtime.tooling.SourceInfoParserState
            r0.<init>(r14)
            r1 = 67
            boolean r2 = r0.matches(r1)
            r3 = 40
            r4 = 41
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L3c
            androidx.compose.runtime.tooling.SourceInfoParserState.advance$default(r0, r6, r5, r7)
            boolean r1 = r0.matches(r1)
            if (r1 == 0) goto L22
            androidx.compose.runtime.tooling.SourceInfoParserState.advance$default(r0, r6, r5, r7)
            r1 = r5
            goto L23
        L22:
            r1 = r6
        L23:
            boolean r2 = r0.matches(r3)
            if (r2 == 0) goto L3a
            androidx.compose.runtime.tooling.SourceInfoParserState.advance$default(r0, r6, r5, r7)
            java.lang.String r2 = ")"
            java.lang.String r2 = r0.takeUntil(r2)
            r0.expect(r4)
            androidx.compose.runtime.tooling.SourceInfoParserState.advance$default(r0, r6, r5, r7)
            r8 = r5
            goto L3f
        L3a:
            r8 = r5
            goto L3e
        L3c:
            r1 = r6
            r8 = r1
        L3e:
            r2 = r7
        L3f:
            h.a.ac r10 = h.a.ac.f47967a
            java.util.List r10 = (java.util.List) r10
            r11 = r10
        L44:
            boolean r12 = hasSection(r0)
            if (r12 == 0) goto L9b
            char r12 = r0.current()
            r13 = 78
            if (r12 == r13) goto L96
            r13 = 80
            if (r12 == r13) goto L91
            r12 = 2
            r0.advance(r12)
            r12 = r6
        L5b:
            if (r12 > 0) goto L6b
            boolean r13 = r0.matches(r4)
            if (r13 != 0) goto L64
            goto L6b
        L64:
            r0.expect(r4)
            androidx.compose.runtime.tooling.SourceInfoParserState.advance$default(r0, r6, r5, r7)
            goto L44
        L6b:
            boolean r13 = r0.atEnd()
            if (r13 != 0) goto L86
            boolean r13 = r0.matches(r3)
            if (r13 == 0) goto L7a
            int r12 = r12 + 1
            goto L82
        L7a:
            boolean r13 = r0.matches(r4)
            if (r13 == 0) goto L82
            int r12 = r12 + (-1)
        L82:
            androidx.compose.runtime.tooling.SourceInfoParserState.advance$default(r0, r6, r5, r7)
            goto L5b
        L86:
            java.lang.String r1 = "unexpected end"
            r0.throwParseError(r1)
            h.e r0 = new h.e
            r0.<init>()
            throw r0
        L91:
            java.util.List r11 = parseParameterIndex(r0)
            goto L44
        L96:
            java.util.List r11 = parseParameterNames(r0)
            goto L44
        L9b:
            r3 = 58
            boolean r3 = r0.matches(r3)
            if (r3 != 0) goto La8
            java.util.List r10 = parseLocations(r0)
            goto Lab
        La8:
            androidx.compose.runtime.tooling.SourceInfoParserState.advance$default(r0, r6, r5, r7)
        Lab:
            java.lang.String r3 = "#"
            java.lang.String r3 = r0.takeUntil(r3)
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 > 0) goto Lbb
            r3 = r7
        Lbb:
            r4 = 35
            boolean r4 = r0.matches(r4)
            if (r4 == 0) goto Lca
            androidx.compose.runtime.tooling.SourceInfoParserState.advance$default(r0, r6, r5, r7)
            java.lang.String r7 = r0.takeUntilEnd()
        Lca:
            r5 = r3
            r3 = r1
            androidx.compose.runtime.tooling.SourceInformation r1 = new androidx.compose.runtime.tooling.SourceInformation
            r9 = r14
            r4 = r2
            r2 = r8
            r8 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.tooling.SourceInformationKt.parseSourceInformationInternal(java.lang.String):androidx.compose.runtime.tooling.SourceInformation");
    }

    private static final String replaceComposePrefix(String str) {
        x.f(str, "<this>");
        x.f("c#", "oldValue");
        x.f("androidx.compose.", "newValue");
        String str2 = str;
        int iX = o.X(str2, "c#", 0, false, 2);
        if (iX < 0) {
            return str;
        }
        return o.u(str2, iX, iX + 2, "androidx.compose.").toString();
    }
}
