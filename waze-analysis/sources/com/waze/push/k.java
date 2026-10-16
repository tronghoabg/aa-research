package com.waze.push;

import com.waze.messages.PushQuestionData;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final PushQuestionData f33441a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.x.h f33442b;

    k(PushQuestionData pushQuestionData) {
        this.f33441a = pushQuestionData;
        this.f33442b = com.waze.x.h.c(pushQuestionData.defaultAction);
    }

    final com.waze.x.h a() {
        return this.f33442b;
    }

    final String b() {
        return this.f33441a.ActionText1;
    }

    final String c() {
        return this.f33441a.ActionText2;
    }

    final String d() {
        return this.f33441a.MessageID;
    }

    final String e() {
        return this.f33441a.NotificationID;
    }

    final String f() {
        return this.f33441a.QuestionID;
    }

    final String g() {
        return this.f33441a.SubText1;
    }

    final String h() {
        return this.f33441a.SubText2;
    }

    final String i() {
        return this.f33441a.Text;
    }
}
