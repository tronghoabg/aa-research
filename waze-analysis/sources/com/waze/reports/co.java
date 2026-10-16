package com.waze.reports;

import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class co implements cp {

    /* renamed from: a, reason: collision with root package name */
    final boolean f33792a;

    /* renamed from: b, reason: collision with root package name */
    final Pattern f33793b;

    public co(String str, boolean z) {
        this.f33793b = str == null ? null : Pattern.compile(str, 2);
        this.f33792a = z;
    }

    @Override // com.waze.reports.cp
    public final boolean a(String str) {
        if (this.f33792a && str.isEmpty()) {
            return true;
        }
        return this.f33793b.matcher(str.trim()).matches();
    }
}
