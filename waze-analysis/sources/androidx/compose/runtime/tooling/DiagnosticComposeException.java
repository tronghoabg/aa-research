package androidx.compose.runtime.tooling;

import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DiagnosticComposeException extends RuntimeException {
    public static final int $stable = 8;
    private final ComposeStackTrace trace;

    public DiagnosticComposeException(ComposeStackTrace composeStackTrace) {
        this.trace = composeStackTrace;
        if (composeStackTrace.getHasSourceInformation()) {
            return;
        }
        List<ComposeStackTraceFrame> listFilterInternalFramesByGroupKey = ComposeStackTraceKt.filterInternalFramesByGroupKey(composeStackTrace);
        int size = listFilterInternalFramesByGroupKey.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i2 = 0; i2 < size; i2++) {
            stackTraceElementArr[i2] = new StackTraceElement("$$compose", "m$" + listFilterInternalFramesByGroupKey.get(i2).getGroupKey(), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    private final /* synthetic */ <T, R> R[] mapToArray(List<? extends T> list, l<? super T, ? extends R> lVar) {
        int size = list.size();
        x.i();
        R[] rArr = (R[]) new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            rArr[i2] = lVar.invoke(list.get(i2));
        }
        return rArr;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (!this.trace.getHasSourceInformation()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Composition stack when thrown:\n");
        ComposeStackTraceKt.appendSourceInformationStackTrace(sb, this.trace);
        return sb.toString();
    }
}
