package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ddt {
    private final boolean a = false;
    private final boolean b = false;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ddt)) {
            return false;
        }
        defpackage.ddt ddtVar = (defpackage.ddt) obj;
        boolean z = ddtVar.a;
        boolean z2 = ddtVar.b;
        return true;
    }

    public final int hashCode() {
        return 39584;
    }

    public final java.lang.String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=false, suggestionSelected=false)";
    }
}
