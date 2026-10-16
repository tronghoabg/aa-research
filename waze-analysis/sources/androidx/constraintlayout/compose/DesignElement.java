package androidx.constraintlayout.compose;

import h.g.b.x;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DesignElement {
    public static final int $stable = 8;
    private String id;
    private HashMap<String, String> params;
    private String type;

    public DesignElement(String str, String str2, HashMap<String, String> map) {
        this.id = str;
        this.type = str2;
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DesignElement copy$default(DesignElement designElement, String str, String str2, HashMap map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = designElement.id;
        }
        if ((i2 & 2) != 0) {
            str2 = designElement.type;
        }
        if ((i2 & 4) != 0) {
            map = designElement.params;
        }
        return designElement.copy(str, str2, map);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final HashMap<String, String> component3() {
        return this.params;
    }

    public final DesignElement copy(String str, String str2, HashMap<String, String> map) {
        return new DesignElement(str, str2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DesignElement)) {
            return false;
        }
        DesignElement designElement = (DesignElement) obj;
        return x.n(this.id, designElement.id) && x.n(this.type, designElement.type) && x.n(this.params, designElement.params);
    }

    public final String getId() {
        return this.id;
    }

    public final HashMap<String, String> getParams() {
        return this.params;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.params.hashCode();
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setParams(HashMap<String, String> map) {
        this.params = map;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "DesignElement(id=" + this.id + ", type=" + this.type + ", params=" + this.params + ')';
    }
}
