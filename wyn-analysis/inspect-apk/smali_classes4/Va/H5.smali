.class public final LVa/H5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Lcom/smaato/sdk/video/vast/model/VastScenarioCreativeData;

    .line 7
    .line 8
    sget p2, LVa/h6;->U:I

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x2d

    .line 11
    .line 12
    rem-int/lit16 p2, p2, 0x80

    .line 13
    .line 14
    sput p2, LVa/h6;->T:I

    .line 15
    .line 16
    invoke-static {p1}, LVa/h6;->Q0(Lcom/smaato/sdk/video/vast/model/VastScenarioCreativeData;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget p2, LVa/h6;->T:I

    .line 21
    .line 22
    add-int/lit8 p2, p2, 0xf

    .line 23
    .line 24
    rem-int/lit16 v0, p2, 0x80

    .line 25
    .line 26
    sput v0, LVa/h6;->U:I

    .line 27
    .line 28
    rem-int/lit8 p2, p2, 0x2

    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    throw p1
.end method
