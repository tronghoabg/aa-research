.class public final LVa/f5;
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
    move-result-object p2

    .line 6
    check-cast p2, Lnet/pubnative/lite/sdk/models/Ad;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    sget v0, LVa/p5;->T:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x27

    .line 18
    .line 19
    rem-int/lit16 v0, v0, 0x80

    .line 20
    .line 21
    sput v0, LVa/p5;->U:I

    .line 22
    .line 23
    invoke-static {p2, p1}, LVa/p5;->V0(Lnet/pubnative/lite/sdk/models/Ad;Ljava/lang/String;)Lnet/pubnative/lite/sdk/models/AdData;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget p2, LVa/p5;->T:I

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x69

    .line 30
    .line 31
    rem-int/lit16 v0, p2, 0x80

    .line 32
    .line 33
    sput v0, LVa/p5;->U:I

    .line 34
    .line 35
    rem-int/lit8 p2, p2, 0x2

    .line 36
    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    throw p1
.end method
