package Ma;

import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes4.dex */
public enum f {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);


    /* renamed from: a, reason: collision with root package name */
    public final String f7590a;

    f(String str) {
        this.f7590a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7590a;
    }
}
