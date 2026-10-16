.class public final synthetic LT3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LA/e0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(LA/e0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT3/g;->a:LA/e0;

    iput p2, p0, LT3/g;->b:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, LT3/g;->a:LA/e0;

    .line 2
    .line 3
    const-string v1, "this$0"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, LA/e0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->q()LS3/e;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "next_job_scheduler_id"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, LS3/e;->o(Ljava/lang/String;)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    long-to-int v1, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v1, v3

    .line 32
    :goto_0
    const v4, 0x7fffffff

    .line 33
    .line 34
    .line 35
    if-ne v1, v4, :cond_1

    .line 36
    .line 37
    move v4, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-int/lit8 v4, v1, 0x1

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->q()LS3/e;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    new-instance v6, LS3/d;

    .line 46
    .line 47
    int-to-long v7, v4

    .line 48
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-direct {v6, v2, v4}, LS3/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v6}, LS3/e;->q(LS3/d;)V

    .line 56
    .line 57
    .line 58
    if-ltz v1, :cond_2

    .line 59
    .line 60
    iget v4, p0, LT3/g;->b:I

    .line 61
    .line 62
    if-gt v1, v4, :cond_2

    .line 63
    .line 64
    move v3, v1

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->q()LS3/e;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v1, LS3/d;

    .line 71
    .line 72
    const/4 v4, 0x1

    .line 73
    int-to-long v4, v4

    .line 74
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-direct {v1, v2, v4}, LS3/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, LS3/e;->q(LS3/d;)V

    .line 82
    .line 83
    .line 84
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0
.end method
