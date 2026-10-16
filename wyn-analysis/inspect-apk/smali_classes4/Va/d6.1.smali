.class public final LVa/d6;
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
    check-cast p1, Lcom/smaato/sdk/core/api/ApiAdResponse;

    .line 7
    .line 8
    sget p2, LVa/h6;->T:I

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x5b

    .line 11
    .line 12
    rem-int/lit16 v0, p2, 0x80

    .line 13
    .line 14
    sput v0, LVa/h6;->U:I

    .line 15
    .line 16
    rem-int/lit8 p2, p2, 0x2

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, LVa/h6;->T0(Lcom/smaato/sdk/core/api/ApiAdResponse;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget p2, LVa/h6;->U:I

    .line 25
    .line 26
    add-int/lit8 p2, p2, 0x51

    .line 27
    .line 28
    rem-int/lit16 p2, p2, 0x80

    .line 29
    .line 30
    sput p2, LVa/h6;->T:I

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-static {p1}, LVa/h6;->T0(Lcom/smaato/sdk/core/api/ApiAdResponse;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    throw p1
.end method
