package com.qonversion.android.sdk.dto;

import ic.d;
import kotlin.Metadata;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/dto/QAttributionProvider;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "AppsFlyer", "Branch", "Adjust", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QAttributionProvider {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QAttributionProvider[] $VALUES;

    @NotNull
    private final String id;
    public static final QAttributionProvider AppsFlyer = new QAttributionProvider("AppsFlyer", 0, "appsflyer");
    public static final QAttributionProvider Branch = new QAttributionProvider("Branch", 1, "branch");
    public static final QAttributionProvider Adjust = new QAttributionProvider("Adjust", 2, "adjust");

    private static final /* synthetic */ QAttributionProvider[] $values() {
        return new QAttributionProvider[]{AppsFlyer, Branch, Adjust};
    }

    static {
        QAttributionProvider[] qAttributionProviderArr$values = $values();
        $VALUES = qAttributionProviderArr$values;
        $ENTRIES = d.t(qAttributionProviderArr$values);
    }

    private QAttributionProvider(String str, int i5, String str2) {
        this.id = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QAttributionProvider valueOf(String str) {
        return (QAttributionProvider) Enum.valueOf(QAttributionProvider.class, str);
    }

    public static QAttributionProvider[] values() {
        return (QAttributionProvider[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
