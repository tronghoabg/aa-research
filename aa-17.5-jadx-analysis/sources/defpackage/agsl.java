package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class agsl {
    private final ahnd classId;
    private final agzj outerClass;
    private final byte[] previouslyFoundClassFileContent;

    public /* synthetic */ agsl(ahnd ahndVar, byte[] bArr, agzj agzjVar, int i, afeu afeuVar) {
        this(ahndVar, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : agzjVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agsl)) {
            return false;
        }
        agsl agslVar = (agsl) obj;
        return affa.f(this.classId, agslVar.classId) && affa.f(this.previouslyFoundClassFileContent, agslVar.previouslyFoundClassFileContent) && affa.f(this.outerClass, agslVar.outerClass);
    }

    public final ahnd getClassId() {
        return this.classId;
    }

    public int hashCode() {
        int iHashCode = this.classId.hashCode() * 31;
        byte[] bArr = this.previouslyFoundClassFileContent;
        int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        agzj agzjVar = this.outerClass;
        return iHashCode2 + (agzjVar != null ? agzjVar.hashCode() : 0);
    }

    public String toString() {
        return "Request(classId=" + this.classId + ", previouslyFoundClassFileContent=" + Arrays.toString(this.previouslyFoundClassFileContent) + ", outerClass=" + this.outerClass + ')';
    }

    public agsl(ahnd ahndVar, byte[] bArr, agzj agzjVar) {
        ahndVar.getClass();
        this.classId = ahndVar;
        this.previouslyFoundClassFileContent = bArr;
        this.outerClass = agzjVar;
    }
}
