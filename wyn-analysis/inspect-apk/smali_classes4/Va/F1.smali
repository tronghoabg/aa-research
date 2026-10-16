.class public final LVa/F1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# instance fields
.field public synthetic a:LVa/K1;


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
    check-cast p1, Lcom/chartboost/sdk/ChartboostDelegate;

    .line 7
    .line 8
    sget p2, LVa/K1;->S:I

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x5b

    .line 11
    .line 12
    rem-int/lit16 p2, p2, 0x80

    .line 13
    .line 14
    sput p2, LVa/K1;->T:I

    .line 15
    .line 16
    iget-object p2, p0, LVa/F1;->a:LVa/K1;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, LVa/J1;

    .line 22
    .line 23
    invoke-direct {p2, p1}, LVa/J1;-><init>(Lcom/chartboost/sdk/ChartboostDelegate;)V

    .line 24
    .line 25
    .line 26
    sget p1, LVa/K1;->S:I

    .line 27
    .line 28
    add-int/lit8 v0, p1, 0x23

    .line 29
    .line 30
    rem-int/lit16 v1, v0, 0x80

    .line 31
    .line 32
    sput v1, LVa/K1;->T:I

    .line 33
    .line 34
    rem-int/lit8 v0, v0, 0x2

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x35

    .line 39
    .line 40
    rem-int/lit16 p1, p1, 0x80

    .line 41
    .line 42
    sput p1, LVa/K1;->T:I

    .line 43
    .line 44
    return-object p2

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    throw p1
.end method
