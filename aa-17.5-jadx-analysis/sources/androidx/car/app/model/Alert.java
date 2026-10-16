package androidx.car.app.model;

import defpackage.rb;
import defpackage.sy;
import defpackage.ta;
import defpackage.tl;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public final class Alert {
    public static final int DURATION_SHOW_INDEFINITELY = Integer.MAX_VALUE;
    private static final int MAX_ACTION_COUNT = 2;
    private final List<Action> mActions;
    private final ta mCallbackDelegate;
    private final long mDuration;
    private final CarIcon mIcon;
    private final int mId;
    private final CarText mSubtitle;
    private final CarText mTitle;

    Alert(sy syVar) {
        int i = syVar.a;
        this.mId = 0;
        Object obj = syVar.c;
        this.mTitle = null;
        Object obj2 = syVar.d;
        this.mSubtitle = null;
        Object obj3 = syVar.e;
        this.mIcon = null;
        Object obj4 = syVar.f;
        this.mActions = tl.b(null);
        long j = syVar.b;
        this.mDuration = 0L;
        Object obj5 = syVar.g;
        this.mCallbackDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Alert) && this.mId == ((Alert) obj).mId;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public ta getCallbackDelegate() {
        return this.mCallbackDelegate;
    }

    public long getDurationMillis() {
        return this.mDuration;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getId() {
        return this.mId;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mId));
    }

    public String toString() {
        return "[id: " + this.mId + ", title: " + this.mTitle + ", icon: " + this.mIcon + "]";
    }

    private Alert() {
        this.mId = 0;
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mActions = new ArrayList();
        this.mDuration = 0L;
        this.mCallbackDelegate = null;
    }
}
