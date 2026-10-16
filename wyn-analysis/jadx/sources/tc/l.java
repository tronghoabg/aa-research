package tc;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f46027a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46028b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46029c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46030d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46031e;

    public l(String str, int i5, int i10, int i11, int i12) {
        if (!(i5 == -1 && i10 == -1) && (i5 < 0 || i10 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i5) + ", " + String.valueOf(i10) + ")");
        }
        if (!(i11 == -1 && i12 == -1) && (i11 < 0 || i11 > i12)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i11) + ", " + String.valueOf(i12) + ")");
        }
        if (i12 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i11));
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i5));
        }
        if (i10 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i10));
        }
        this.f46027a = str;
        this.f46028b = i5;
        this.f46029c = i10;
        this.f46030d = i11;
        this.f46031e = i12;
    }

    public static l a(JSONObject jSONObject) {
        return new l(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
