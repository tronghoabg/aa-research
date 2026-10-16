package androidx.compose.runtime.tooling;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MovableContentKt;
import h.a.c;
import h.a.i;
import h.g.a.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeStackTraceKt {
    private static final boolean IncludeDebugInfo = false;
    private static final String RuntimePackageHash = "9igjgp";

    public static final void appendGroupKeyStackTrace(StringBuilder sb, ComposeStackTrace composeStackTrace) {
        List<ComposeStackTraceFrame> listFilterInternalFramesByGroupKey = filterInternalFramesByGroupKey(composeStackTrace);
        int size = listFilterInternalFramesByGroupKey.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComposeStackTraceFrame composeStackTraceFrame = listFilterInternalFramesByGroupKey.get(i2);
            sb.append("\tat $$compose.m$");
            sb.append(composeStackTraceFrame.getGroupKey());
            sb.append("(SourceFile:1)\n");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[PHI: r9
  0x003e: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v13 java.lang.String) binds: [B:7:0x002a, B:12:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void appendSourceInformationStackTrace(java.lang.StringBuilder r12, androidx.compose.runtime.tooling.ComposeStackTrace r13) {
        /*
            java.util.List r0 = h.a.i.b()
            java.util.List r13 = r13.getFrames()
            java.util.List r13 = h.a.i.D(r13)
            r1 = r13
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L18:
            if (r4 >= r1) goto Lc8
            java.lang.Object r7 = r13.get(r4)
            androidx.compose.runtime.tooling.ComposeStackTraceFrame r7 = (androidx.compose.runtime.tooling.ComposeStackTraceFrame) r7
            androidx.compose.runtime.tooling.SourceInformation r8 = r7.getSourceInfo()
            if (r8 == 0) goto Lc4
            java.lang.String r9 = r8.getFunctionName()
            if (r9 != 0) goto L3e
            boolean r9 = r8.isCall()
            r10 = 1
            if (r10 == r9) goto L35
            r9 = r3
            goto L37
        L35:
            java.lang.String r9 = "<lambda>"
        L37:
            if (r9 != 0) goto L3e
            if (r5 != 0) goto L3f
            java.lang.String r5 = "<unknown function>"
            goto L3f
        L3e:
            r5 = r9
        L3f:
            java.lang.String r9 = r8.getSourceFile()
            if (r9 != 0) goto L4a
            if (r6 != 0) goto L4b
            java.lang.String r6 = "<unknown file>"
            goto L4b
        L4a:
            r6 = r9
        L4b:
            java.util.List r9 = r8.getLocations()
            java.lang.Integer r10 = r7.getGroupOffset()
            if (r10 == 0) goto L7a
            java.lang.Integer r10 = r7.getGroupOffset()
            int r10 = r10.intValue()
            int r11 = r9.size()
            if (r10 >= r11) goto L7a
            java.lang.Integer r7 = r7.getGroupOffset()
            int r7 = r7.intValue()
            java.lang.Object r7 = r9.get(r7)
            androidx.compose.runtime.tooling.LocationSourceInformation r7 = (androidx.compose.runtime.tooling.LocationSourceInformation) r7
            int r7 = r7.getLineNumber()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            goto L7c
        L7a:
            java.lang.String r7 = "<unknown line>"
        L7c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r10 = 40
            r9.append(r10)
            r9.append(r6)
            r10 = 58
            r9.append(r10)
            r9.append(r7)
            r7 = 41
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            boolean r9 = r8.isCall()
            if (r9 != 0) goto La9
            java.lang.Object r9 = h.a.i.x(r0)
            java.lang.String r9 = (java.lang.String) r9
        La9:
            java.lang.String r9 = r8.getFunctionName()
            java.lang.String r10 = "rememberCompositionContext"
            boolean r9 = h.g.b.x.n(r9, r10)
            if (r9 == 0) goto Lc1
            java.lang.String r8 = r8.getPackageHash()
            java.lang.String r9 = "9igjgp"
            boolean r8 = h.g.b.x.n(r8, r9)
            if (r8 != 0) goto Lc4
        Lc1:
            r0.add(r7)
        Lc4:
            int r4 = r4 + 1
            goto L18
        Lc8:
            java.util.List r13 = h.a.i.a(r0)
            java.util.List r13 = h.a.i.D(r13)
            r0 = r13
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
        Ld7:
            if (r2 >= r0) goto Lef
            java.lang.Object r1 = r13.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "\tat "
            r12.append(r3)
            r12.append(r1)
            r1 = 10
            r12.append(r1)
            int r2 = r2 + 1
            goto Ld7
        Lef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.tooling.ComposeStackTraceKt.appendSourceInformationStackTrace(java.lang.StringBuilder, androidx.compose.runtime.tooling.ComposeStackTrace):void");
    }

    public static final void appendStackTrace(StringBuilder sb, ComposeStackTrace composeStackTrace) {
        if (composeStackTrace.getHasSourceInformation()) {
            appendSourceInformationStackTrace(sb, composeStackTrace);
        } else {
            appendGroupKeyStackTrace(sb, composeStackTrace);
        }
    }

    public static final Throwable attachComposeStackTrace(Throwable th, a<ComposeStackTrace> aVar) {
        tryAttachComposeStackTrace(th, aVar);
        return th;
    }

    public static final List<ComposeStackTraceFrame> filterInternalFramesByGroupKey(ComposeStackTrace composeStackTrace) {
        int[] iArr = {201, 202, 204, 206, 207, 125, ComposerKt.defaultsKey, MovableContentKt.movableContentKey, 200};
        int size = composeStackTrace.getFrames().size();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            ComposeStackTraceFrame composeStackTraceFrame = composeStackTrace.getFrames().get(i2);
            if (!c.ah(iArr, composeStackTraceFrame.getGroupKey())) {
                if (composeStackTraceFrame.getGroupKey() == 100) {
                    int i4 = i2 + 2;
                    if (i4 < size && composeStackTrace.getFrames().get(i4).getGroupKey() == 1000) {
                        break;
                    }
                    i.x(arrayList);
                } else {
                    arrayList.add(composeStackTraceFrame);
                }
            }
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean tryAttachComposeStackTrace(java.lang.Throwable r6, h.g.a.a<androidx.compose.runtime.tooling.ComposeStackTrace> r7) {
        /*
            java.lang.String r0 = "<this>"
            h.g.b.x.f(r6, r0)
            h.e.b r0 = h.e.c.f48070a
            java.util.List r0 = r0.a(r6)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L14:
            if (r3 >= r1) goto L24
            java.lang.Object r4 = r0.get(r3)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r4 = r4 instanceof androidx.compose.runtime.tooling.DiagnosticComposeException
            if (r4 == 0) goto L21
            goto L78
        L21:
            int r3 = r3 + 1
            goto L14
        L24:
            java.lang.Object r7 = r7.invoke()     // Catch: java.lang.Throwable -> L6f
            androidx.compose.runtime.tooling.ComposeStackTrace r7 = (androidx.compose.runtime.tooling.ComposeStackTrace) r7     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L5e
            boolean r0 = r7.getHasSourceInformation()     // Catch: java.lang.Throwable -> L6f
            r1 = 1
            if (r0 == 0) goto L51
            java.util.List r0 = r7.getFrames()     // Catch: java.lang.Throwable -> L6f
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L6f
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L6f
            r4 = r2
        L3f:
            if (r4 >= r3) goto L5e
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L6f
            androidx.compose.runtime.tooling.ComposeStackTraceFrame r5 = (androidx.compose.runtime.tooling.ComposeStackTraceFrame) r5     // Catch: java.lang.Throwable -> L6f
            androidx.compose.runtime.tooling.SourceInformation r5 = r5.getSourceInfo()     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L4e
            goto L5f
        L4e:
            int r4 = r4 + 1
            goto L3f
        L51:
            java.util.List r0 = r7.getFrames()     // Catch: java.lang.Throwable -> L6f
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L5e
            goto L5f
        L5e:
            r1 = r2
        L5f:
            if (r1 == 0) goto L69
            androidx.compose.runtime.tooling.DiagnosticComposeException r0 = new androidx.compose.runtime.tooling.DiagnosticComposeException     // Catch: java.lang.Throwable -> L67
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r7 = move-exception
            goto L6d
        L69:
            r0 = 0
        L6a:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L67
            goto L72
        L6d:
            r0 = r7
            goto L72
        L6f:
            r7 = move-exception
            r0 = r7
            r1 = r2
        L72:
            if (r0 == 0) goto L78
            e.a.h.ad.c(r6, r0)
            return r1
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.tooling.ComposeStackTraceKt.tryAttachComposeStackTrace(java.lang.Throwable, h.g.a.a):boolean");
    }
}
