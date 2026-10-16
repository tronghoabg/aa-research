package H6;

import A7.AbstractC0279p0;
import android.util.JsonWriter;
import java.io.IOException;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4946a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4947b;

    public /* synthetic */ g(String str, int i5) {
        this.f4946a = i5;
        this.f4947b = str;
    }

    @Override // H6.h
    public /* synthetic */ void o(JsonWriter jsonWriter) throws IOException {
        Object obj = i.f4948b;
        jsonWriter.name("params").beginObject();
        String str = this.f4947b;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public String toString() {
        switch (this.f4946a) {
            case 1:
                return AbstractC0279p0.n(new StringBuilder("<"), this.f4947b, '>');
            default:
                return super.toString();
        }
    }
}
