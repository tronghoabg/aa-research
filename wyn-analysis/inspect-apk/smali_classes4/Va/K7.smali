.class public final LVa/K7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/X9;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LVa/K7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LVa/X9;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LVa/K7;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVa/K7;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(LVa/Y9;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget v0, p0, LVa/K7;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LVa/K7;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, LVa/cb;

    .line 9
    .line 10
    sget p2, LVa/cb;->g:I

    .line 11
    .line 12
    add-int/lit8 p2, p2, 0x41

    .line 13
    .line 14
    rem-int/lit16 v0, p2, 0x80

    .line 15
    .line 16
    sput v0, LVa/cb;->f:I

    .line 17
    .line 18
    rem-int/lit8 p2, p2, 0x2

    .line 19
    .line 20
    invoke-virtual {p1, p3}, LVa/cb;->x(Landroid/view/MotionEvent;)V

    .line 21
    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    throw p1

    .line 29
    :pswitch_0
    new-instance v0, LVa/O;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, v1}, LVa/O;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p0, v0, LVa/O;->g:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object p1, v0, LVa/O;->d:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p2, v0, LVa/O;->e:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object p3, v0, LVa/O;->f:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {v0}, LVa/Cb;->j(LVa/Ba;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    return p1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
