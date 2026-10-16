package tc;

import R8.v;
import org.apache.tika.mime.MimeTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tc.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC4156b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4156b f45974a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC4156b[] f45975b;

    static {
        EnumC4156b enumC4156b = new EnumC4156b("PLAIN_TEXT", 0);
        f45974a = enumC4156b;
        f45975b = new EnumC4156b[]{enumC4156b};
    }

    public static EnumC4156b a(String str) {
        for (EnumC4156b enumC4156b : values()) {
            enumC4156b.getClass();
            if (MimeTypes.PLAIN_TEXT.equals(str)) {
                return enumC4156b;
            }
        }
        throw new NoSuchFieldException(v.f("No such ClipboardContentFormat: ", str));
    }

    public static EnumC4156b valueOf(String str) {
        return (EnumC4156b) Enum.valueOf(EnumC4156b.class, str);
    }

    public static EnumC4156b[] values() {
        return (EnumC4156b[]) f45975b.clone();
    }
}
