package com.qonversion.android.sdk.automations.dto;

import ic.d;
import kotlin.Metadata;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", "", "(Ljava/lang/String;I)V", "Push", "FullScreen", "NoAnimation", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QScreenPresentationStyle {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QScreenPresentationStyle[] $VALUES;
    public static final QScreenPresentationStyle Push = new QScreenPresentationStyle("Push", 0);
    public static final QScreenPresentationStyle FullScreen = new QScreenPresentationStyle("FullScreen", 1);
    public static final QScreenPresentationStyle NoAnimation = new QScreenPresentationStyle("NoAnimation", 2);

    private static final /* synthetic */ QScreenPresentationStyle[] $values() {
        return new QScreenPresentationStyle[]{Push, FullScreen, NoAnimation};
    }

    static {
        QScreenPresentationStyle[] qScreenPresentationStyleArr$values = $values();
        $VALUES = qScreenPresentationStyleArr$values;
        $ENTRIES = d.t(qScreenPresentationStyleArr$values);
    }

    private QScreenPresentationStyle(String str, int i5) {
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QScreenPresentationStyle valueOf(String str) {
        return (QScreenPresentationStyle) Enum.valueOf(QScreenPresentationStyle.class, str);
    }

    public static QScreenPresentationStyle[] values() {
        return (QScreenPresentationStyle[]) $VALUES.clone();
    }
}
