.class public interface abstract LR6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final Q8:LXd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LXd/c;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, LXd/c;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LR6/b;->Q8:LXd/c;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract getAmount()I
.end method

.method public abstract getType()Ljava/lang/String;
.end method
