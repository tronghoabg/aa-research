package defpackage;

/* loaded from: classes2.dex */
public final class ddl {
    private final boolean a = false;
    private final boolean b = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddl)) {
            return false;
        }
        ddl ddlVar = (ddl) obj;
        boolean z = ddlVar.a;
        boolean z2 = ddlVar.b;
        return true;
    }

    public final int hashCode() {
        return 39584;
    }

    public final String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=false, suggestionSelected=false)";
    }
}
