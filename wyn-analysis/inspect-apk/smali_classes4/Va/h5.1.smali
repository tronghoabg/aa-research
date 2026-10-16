.class public final LVa/h5;
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
    move-result-object v0

    .line 6
    check-cast v0, Lnet/pubnative/lite/sdk/models/Ad;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    sget v1, LVa/p5;->U:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x17

    .line 18
    .line 19
    rem-int/lit16 v2, v1, 0x80

    .line 20
    .line 21
    sput v2, LVa/p5;->T:I

    .line 22
    .line 23
    rem-int/lit8 v1, v1, 0x2

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-static {v0, p1}, LVa/p5;->N0(Lnet/pubnative/lite/sdk/models/Ad;Ljava/lang/String;)Lnet/pubnative/lite/sdk/models/AdData;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget v0, LVa/p5;->U:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x33

    .line 34
    .line 35
    rem-int/lit16 v1, v0, 0x80

    .line 36
    .line 37
    sput v1, LVa/p5;->T:I

    .line 38
    .line 39
    rem-int/lit8 v0, v0, 0x2

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    const/16 v0, 0x10

    .line 44
    .line 45
    div-int/2addr v0, p2

    .line 46
    :cond_0
    return-object p1

    .line 47
    :cond_1
    invoke-static {v0, p1}, LVa/p5;->N0(Lnet/pubnative/lite/sdk/models/Ad;Ljava/lang/String;)Lnet/pubnative/lite/sdk/models/AdData;

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    throw p1
.end method
