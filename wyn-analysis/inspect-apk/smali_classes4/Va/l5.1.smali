.class public final LVa/l5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# instance fields
.field public synthetic a:LVa/p5;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Lnet/pubnative/lite/sdk/vpaid/VideoAdListener;

    .line 7
    .line 8
    sget p2, LVa/p5;->T:I

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x5

    .line 11
    .line 12
    rem-int/lit16 v0, p2, 0x80

    .line 13
    .line 14
    sput v0, LVa/p5;->U:I

    .line 15
    .line 16
    rem-int/lit8 p2, p2, 0x2

    .line 17
    .line 18
    iget-object v0, p0, LVa/l5;->a:LVa/p5;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    new-instance p2, LVa/o5;

    .line 27
    .line 28
    invoke-direct {p2, p1}, LVa/o5;-><init>(Lnet/pubnative/lite/sdk/vpaid/VideoAdListener;)V

    .line 29
    .line 30
    .line 31
    sget p1, LVa/p5;->U:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x39

    .line 34
    .line 35
    rem-int/lit16 v0, p1, 0x80

    .line 36
    .line 37
    sput v0, LVa/p5;->T:I

    .line 38
    .line 39
    rem-int/lit8 p1, p1, 0x2

    .line 40
    .line 41
    if-nez p1, :cond_0

    .line 42
    .line 43
    return-object p2

    .line 44
    :cond_0
    throw v1

    .line 45
    :cond_1
    new-instance p2, LVa/o5;

    .line 46
    .line 47
    invoke-direct {p2, p1}, LVa/o5;-><init>(Lnet/pubnative/lite/sdk/vpaid/VideoAdListener;)V

    .line 48
    .line 49
    .line 50
    sget p1, LVa/p5;->U:I

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x39

    .line 53
    .line 54
    rem-int/lit16 p2, p1, 0x80

    .line 55
    .line 56
    sput p2, LVa/p5;->T:I

    .line 57
    .line 58
    rem-int/lit8 p1, p1, 0x2

    .line 59
    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    throw v1
.end method
