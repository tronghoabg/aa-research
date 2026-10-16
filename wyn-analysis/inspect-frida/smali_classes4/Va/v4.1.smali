.class public final LVa/v4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Lcom/mbridge/msdk/foundation/entity/CampaignEx;

    .line 7
    .line 8
    sget v0, LVa/z4;->X:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x75

    .line 11
    .line 12
    rem-int/lit16 v0, v0, 0x80

    .line 13
    .line 14
    sput v0, LVa/z4;->W:I

    .line 15
    .line 16
    invoke-static {p1}, LVa/z4;->I0(Lcom/mbridge/msdk/foundation/entity/CampaignEx;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sget p1, LVa/z4;->W:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x17

    .line 23
    .line 24
    rem-int/lit16 v2, p1, 0x80

    .line 25
    .line 26
    sput v2, LVa/z4;->X:I

    .line 27
    .line 28
    rem-int/lit8 p1, p1, 0x2

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    const/16 p1, 0x51

    .line 33
    .line 34
    div-int/2addr p1, p2

    .line 35
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method
