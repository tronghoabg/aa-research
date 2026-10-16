.class public final LVa/S;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public synthetic d:LVa/B7;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/S;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget v0, p0, LVa/S;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, LVa/B7;->h:I

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0x1b

    .line 9
    .line 10
    rem-int/lit16 v2, v1, 0x80

    .line 11
    .line 12
    sput v2, LVa/B7;->i:I

    .line 13
    .line 14
    rem-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    iget-object v2, p0, LVa/S;->d:LVa/B7;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, v2, LVa/B7;->f:Ljava/util/ArrayList;

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x6f

    .line 24
    .line 25
    rem-int/lit16 v2, v0, 0x80

    .line 26
    .line 27
    sput v2, LVa/B7;->i:I

    .line 28
    .line 29
    rem-int/lit8 v0, v0, 0x2

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    throw v3

    .line 38
    :cond_1
    iget-object v0, v2, LVa/B7;->f:Ljava/util/ArrayList;

    .line 39
    .line 40
    throw v3

    .line 41
    :pswitch_0
    iget-object v0, p0, LVa/S;->d:LVa/B7;

    .line 42
    .line 43
    invoke-virtual {v0}, LVa/B7;->q()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
