.class public final synthetic LM2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/h;
.implements LR1/p;


# instance fields
.field public final synthetic a:LM2/l;


# direct methods
.method public synthetic constructor <init>(LM2/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/i;->a:LM2/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LM2/s;

    iget-object v0, p0, LM2/i;->a:LM2/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public b(JLQ1/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/i;->a:LM2/l;

    .line 2
    .line 3
    iget-object v0, v0, LM2/l;->K:[Ls2/C;

    .line 4
    .line 5
    invoke-static {p1, p2, p3, v0}, Ls2/a;->f(JLQ1/o;[Ls2/C;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
