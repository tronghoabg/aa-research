package k;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f50858a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f50859b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f50860c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f50861d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f50862e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f50863f;

    public o(boolean z, boolean z2, Long l2, Long l3, Long l4, Long l5) {
        this.f50858a = z;
        this.f50859b = z2;
        this.f50860c = l2;
        this.f50861d = l3;
        this.f50862e = l4;
        this.f50863f = l5;
    }

    static /* synthetic */ String b(long j2, String str) {
        return str + j2;
    }

    public final boolean a() {
        return this.f50859b;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f50858a) {
            arrayList.add("isRegularFile");
        }
        if (this.f50859b) {
            arrayList.add("isDirectory");
        }
        Long l2 = this.f50860c;
        if (l2 != null) {
            Objects.toString(l2);
            arrayList.add("byteCount=".concat(l2.toString()));
        }
        Long l3 = this.f50861d;
        if (l3 != null) {
            Objects.toString(l3);
            arrayList.add("createdAt=".concat(l3.toString()));
        }
        Long l4 = this.f50862e;
        if (l4 != null) {
            Objects.toString(l4);
            arrayList.add("lastModifiedAt=".concat(l4.toString()));
        }
        Long l5 = this.f50863f;
        if (l5 != null) {
            Objects.toString(l5);
            arrayList.add("lastAccessedAt=".concat(l5.toString()));
        }
        return h.a.i.aM(arrayList, ", ", "FileMetadata(", ")", 0, null, 56);
    }
}
