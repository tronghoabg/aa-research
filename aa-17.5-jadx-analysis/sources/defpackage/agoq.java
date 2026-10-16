package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agoq {
    private agnp annotationParameterDefaultValue;
    private final List<agms> annotations;
    private final List<agqc> extensions;
    private int flags;
    private String name;
    public agol type;
    private agol varargElementType;

    public agoq(int i, String str) {
        str.getClass();
        this.flags = i;
        this.name = str;
        this.annotations = new ArrayList(0);
        List<agqf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            agqc agqcVarCreateValueParameterExtension = ((agqf) it.next()).createValueParameterExtension();
            if (agqcVarCreateValueParameterExtension != null) {
                arrayList.add(agqcVarCreateValueParameterExtension);
            }
        }
        this.extensions = arrayList;
    }

    public final agnp getAnnotationParameterDefaultValue() {
        return this.annotationParameterDefaultValue;
    }

    public final List<agms> getAnnotations() {
        return this.annotations;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final String getName() {
        return this.name;
    }

    public final agol getType() {
        agol agolVar = this.type;
        if (agolVar != null) {
            return agolVar;
        }
        affa.d(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA);
        return null;
    }

    public final agol getVarargElementType() {
        return this.varargElementType;
    }

    public final void setAnnotationParameterDefaultValue(agnp agnpVar) {
        this.annotationParameterDefaultValue = agnpVar;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setType(agol agolVar) {
        agolVar.getClass();
        this.type = agolVar;
    }

    public final void setVarargElementType(agol agolVar) {
        this.varargElementType = agolVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agoq(String str) {
        this(0, str);
        str.getClass();
    }
}
