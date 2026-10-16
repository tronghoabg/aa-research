package com.google.android.apps.auto.components.system.statusbar;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.widget.TextClock;
import defpackage.afck;
import defpackage.afeu;
import defpackage.ahnc;
import defpackage.dmx;
import defpackage.dty;
import defpackage.ecw;
import defpackage.eqa;
import defpackage.wub;
import j$.time.Duration;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/google/android/apps/auto/components/system/statusbar/GhTextClock;", "Landroid/widget/TextClock;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "testingTimezone", "", "getTestingTimezone$annotations", "()V", "getTestingTimezone", "()Ljava/lang/String;", "setTestingTimezone", "(Ljava/lang/String;)V", "onFinishInflate", "", "onAttachedToWindow", "getLocalizedPattern", "format", "setTextAppearance", "resId", "Companion", "java.com.google.android.apps.auto.components.system.statusbar_statusbar"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GhTextClock extends TextClock {
    public static final Duration a = wub.am(1);
    public static final boolean b = true;

    public /* synthetic */ GhTextClock(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    private static final String a(String str) {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), str);
        int length = bestDateTimePattern.length();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i < length) {
                char cCharAt = bestDateTimePattern.charAt(i);
                if (cCharAt == '\'') {
                    z = !z;
                    cCharAt = '\'';
                }
                if (!z && cCharAt == 'a') {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            bestDateTimePattern.getClass();
            return bestDateTimePattern;
        }
        int i2 = i;
        while (i2 > 0) {
            int i3 = i2 - 1;
            if (!Character.isWhitespace(bestDateTimePattern.charAt(i3))) {
                break;
            }
            i2 = i3;
        }
        bestDateTimePattern.getClass();
        String strSubstring = bestDateTimePattern.substring(0, i2);
        strSubstring.getClass();
        String strSubstring2 = bestDateTimePattern.substring(i + 1);
        strSubstring2.getClass();
        return strSubstring.concat(strSubstring2);
    }

    @Override // android.widget.TextClock, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eqa eqaVarD = ecw.d(this);
        eqaVarD.getClass();
        ahnc.d(dty.f(eqaVarD), null, 0, new dmx(this, (afck) null, 17), 3);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setFormat12Hour(a(getFormat12Hour().toString()));
        setFormat24Hour(a(getFormat24Hour().toString()));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        if (getAutoSizeTextType() == 1) {
            setAutoSizeTextTypeWithDefaults(1);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GhTextClock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GhTextClock(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GhTextClock(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GhTextClock(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
