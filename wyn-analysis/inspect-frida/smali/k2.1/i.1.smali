.class public final synthetic Lk2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/I;


# instance fields
.field public final synthetic a:Lk2/l;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lk2/l;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/i;->a:Lk2/l;

    iput-object p2, p0, Lk2/i;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lk2/a;LN1/N;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/i;->a:Lk2/l;

    .line 2
    .line 3
    iget-object v1, p0, Lk2/i;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2}, Lk2/l;->x(Ljava/lang/Object;Lk2/a;LN1/N;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
