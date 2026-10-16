.class public final LVa/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/za;


# instance fields
.field public synthetic a:LVa/x;


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    sget v0, LVa/x;->r:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/x;->s:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/w;->a:LVa/x;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    sget v0, LVa/x;->s:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x6f

    .line 22
    .line 23
    rem-int/lit16 v3, v0, 0x80

    .line 24
    .line 25
    sput v3, LVa/x;->r:I

    .line 26
    .line 27
    rem-int/lit8 v0, v0, 0x2

    .line 28
    .line 29
    invoke-virtual {v1, v2}, LVa/x;->n(Z)V

    .line 30
    .line 31
    .line 32
    const/16 v0, 0x33

    .line 33
    .line 34
    div-int/2addr v0, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sget v0, LVa/x;->s:I

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x6f

    .line 39
    .line 40
    rem-int/lit16 v3, v0, 0x80

    .line 41
    .line 42
    sput v3, LVa/x;->r:I

    .line 43
    .line 44
    rem-int/lit8 v0, v0, 0x2

    .line 45
    .line 46
    invoke-virtual {v1, v2}, LVa/x;->n(Z)V

    .line 47
    .line 48
    .line 49
    :goto_0
    sget v0, LVa/x;->r:I

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x45

    .line 52
    .line 53
    rem-int/lit16 v0, v0, 0x80

    .line 54
    .line 55
    sput v0, LVa/x;->s:I

    .line 56
    .line 57
    return-void
.end method
