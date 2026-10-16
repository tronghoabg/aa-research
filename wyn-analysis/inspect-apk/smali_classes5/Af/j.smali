.class public final LAf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAf/k;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LAf/k;Ltf/l;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LAf/j;->a:I

    const-string v0, "predicate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LAf/j;->b:Ljava/lang/Object;

    .line 6
    iput-object p2, p0, LAf/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LAf/o;Lcom/unity3d/services/core/network/domain/CleanupDirectory$invoke$$inlined$sortedBy$1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LAf/j;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, LAf/j;->b:Ljava/lang/Object;

    iput-object p2, p0, LAf/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    const/4 v0, 0x4

    iput v0, p0, LAf/j;->a:I

    sget-object v0, Lqf/h;->a:Lqf/h;

    const-string v1, "start"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LAf/j;->b:Ljava/lang/Object;

    .line 3
    iput-object v0, p0, LAf/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Ltf/p;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LAf/j;->a:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, LAf/j;->b:Ljava/lang/Object;

    .line 12
    iput-object p2, p0, LAf/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltf/a;Ltf/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LAf/j;->a:I

    const-string v0, "getNextValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAf/j;->b:Ljava/lang/Object;

    iput-object p2, p0, LAf/j;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget v0, p0, LAf/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/f;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lqf/f;-><init>(LAf/j;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, LBf/b;

    .line 13
    .line 14
    invoke-direct {v0, p0}, LBf/b;-><init>(LAf/j;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    new-instance v0, LAf/f;

    .line 19
    .line 20
    invoke-direct {v0, p0}, LAf/f;-><init>(LAf/j;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_2
    iget-object v0, p0, LAf/j;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, LAf/o;

    .line 27
    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, LAf/o;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object v0, p0, LAf/j;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lcom/unity3d/services/core/network/domain/CleanupDirectory$invoke$$inlined$sortedBy$1;

    .line 54
    .line 55
    invoke-static {v1, v0}, Lff/s;->d0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :pswitch_3
    new-instance v0, LAf/i;

    .line 64
    .line 65
    invoke-direct {v0, p0}, LAf/i;-><init>(LAf/j;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
